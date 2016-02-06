package com.sample.livedoorweatherapisample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 気温
 */
public class Temperature {

    @Expose
    @SerializedName("min")
    private min min;

    @Expose
    @SerializedName("max")
    private max max;

    public Temperature.min getMin() {
        return min;
    }

    public void setMin(Temperature.min min) {
        this.min = min;
    }

    public Temperature.max getMax() {
        return max;
    }

    public void setMax(Temperature.max max) {
        this.max = max;
    }

    private class min {
        @Expose
        @SerializedName("celsius")
        private double celsius;

        @Expose
        @SerializedName("fahrenheit")
        private double fahrenheit;

        public double getCelsius() {
            return celsius;
        }

        public void setCelsius(double celsius) {
            this.celsius = celsius;
        }

        public double getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(double fahrenheit) {
            this.fahrenheit = fahrenheit;
        }
    }

    private class max {
        @Expose
        @SerializedName("celsius")
        private double celsius;

        @Expose
        @SerializedName("fahrenheit")
        private double fahrenheit;

        public double getCelsius() {
            return celsius;
        }

        public void setCelsius(double celsius) {
            this.celsius = celsius;
        }

        public double getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(double fahrenheit) {
            this.fahrenheit = fahrenheit;
        }
    }

}
