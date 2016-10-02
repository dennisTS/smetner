package com.smetner.repository;

import com.smetner.model.Browser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BrowserRepository extends PagingAndSortingRepository<Browser, Long> {

    @Query(value = "select rendering_engine, " +
            "max(cast(engine_version as signed)) max_version, " +
            "min(css_grade) max_css_grade, " +
            "group_concat(distinct platform order by platform separator ', ') platforms, " +
            "count(*) quantity " +
            "" +
            "from browsers " +
            "" +
            "group by rendering_engine " +
            "" +
            "order by rendering_engine asc", nativeQuery = true)
    public List<Object[]> getSummary();
}
