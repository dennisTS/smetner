package com.smetner.service;

import com.smetner.model.Browser;
import com.smetner.model.EngineSummary;
import com.smetner.repository.BrowserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrowserService {

    private static final String SCHEMA_MISMATCH_MESSAGE = "DB schema mismatch. Error getting query results";

    private static final Logger LOG = LoggerFactory.getLogger(BrowserService.class);

    @Autowired
    private BrowserRepository repository;

    public Iterable<Browser> getBrowserModels() {
        return repository.findAll();
    }

    public List<EngineSummary> getEngineSummaries() {
        List<Object[]> rawSummaries = repository.getSummary();
        List<EngineSummary> summaryModels = new ArrayList<>();

        for (Object[] rawSummary : rawSummaries) {
            summaryModels.add(getSummary(rawSummary));
        }

        return summaryModels;
    }

    private EngineSummary getSummary(Object[] rawSummary) {
        EngineSummary summary = new EngineSummary();

        summary.setRenderingEngine(safeGetElement(rawSummary, 0));
        summary.setMaxEngineVersion(safeGetElement(rawSummary, 1));
        summary.setBestCssGrade(safeGetElement(rawSummary, 2));
        summary.setPlatforms(safeGetElement(rawSummary, 3));
        summary.setQuantity(safeGetElement(rawSummary, 4));

        return summary;
    }

    private String safeGetElement(Object[] array, int ordinal) {
        try {
            return String.valueOf(array[ordinal]);
        } catch (IndexOutOfBoundsException e) {
            LOG.error(SCHEMA_MISMATCH_MESSAGE, e);
        }

        return null;
    }
}
