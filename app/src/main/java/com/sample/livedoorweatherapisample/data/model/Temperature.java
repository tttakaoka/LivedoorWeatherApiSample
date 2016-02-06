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
        private int celsius;

        @Expose
        @SerializedName("fahrenheit")
        private int fahrenheit;

        public int getCelsius() {
            return celsius;
        }

        public void setCelsius(int celsius) {
            this.celsius = celsius;
        }

        public int getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(int fahrenheit) {
            this.fahrenheit = fahrenheit;
        }
    }

    private class max {
        @Expose
        @SerializedName("celsius")
        private int celsius;

        @Expose
        @SerializedName("fahrenheit")
        private int fahrenheit;

        public int getCelsius() {
            return celsius;
        }

        public void setCelsius(int celsius) {
            this.celsius = celsius;
        }

        public int getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(int fahrenheit) {
            this.fahrenheit = fahrenheit;
        }
    }

}
