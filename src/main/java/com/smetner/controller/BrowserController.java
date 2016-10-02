package com.smetner.controller;

import com.smetner.service.BrowserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BrowserController {

    private static final String INDEX_JSP = "index";

    private static final String BROWSERS_ATTRIBUTE = "browsers";
    private static final String SUMMARIES_ATTRIBUTE = "summaries";

    @Autowired
    BrowserService browserService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute(BROWSERS_ATTRIBUTE, browserService.getBrowserModels());
        model.addAttribute(SUMMARIES_ATTRIBUTE, browserService.getEngineSummaries());

        return INDEX_JSP;
    }
}
