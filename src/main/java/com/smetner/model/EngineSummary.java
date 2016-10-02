package com.smetner.model;

public class EngineSummary {
    private String renderingEngine;
    private String maxEngineVersion;
    private String bestCssGrade;
    private String platforms;
    private String quantity;

    public String getRenderingEngine() {
        return renderingEngine;
    }

    public void setRenderingEngine(String renderingEngine) {
        this.renderingEngine = renderingEngine;
    }

    public String getMaxEngineVersion() {
        return maxEngineVersion;
    }

    public void setMaxEngineVersion(String maxEngineVersion) {
        this.maxEngineVersion = maxEngineVersion;
    }

    public String getBestCssGrade() {
        return bestCssGrade;
    }

    public void setBestCssGrade(String maxCssGrade) {
        this.bestCssGrade = maxCssGrade;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
