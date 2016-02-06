package com.sample.livedoorweatherapisample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 予想
 */
public class Forecast {

    @Expose
    @SerializedName("dateLabel")
    private String dateLabel;

    @Expose
    @SerializedName("telop")
    private String telop;

    @Expose
    @SerializedName("date")
    private String date;

    @Expose
    @SerializedName("temperature")
    private Temperature temperature;

    public String getDateLabel() {
        return dateLabel;
    }

    public void setDateLabel(String dateLabel) {
        this.dateLabel = dateLabel;
    }

    public String getTelop() {
        return telop;
    }

    public void setTelop(String telop) {
        this.telop = telop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
