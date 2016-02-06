package com.sample.livedoorweatherapisample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Retrofit用の天気予報Entity
 */
public class WeatherEntity {

    @Expose
    @SerializedName("pinpointLocations")
    private List<PinPointLocation> pinpointLocations;

    @Expose
    @SerializedName("forecasts")
    private List<Forecast> forecasts;

    @Expose
    @SerializedName("link")
    private String link;

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<PinPointLocation> getPinpointLocations() {
        return pinpointLocations;
    }

    public void setPinpointLocations(List<PinPointLocation> pinpointLocations) {
        this.pinpointLocations = pinpointLocations;
    }
}
