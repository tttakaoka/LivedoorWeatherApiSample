package com.sample.livedoorweatherapisample;

import com.sample.livedoorweatherapisample.data.model.WeatherEntity;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * REST インターフェース
 */
public interface WeatherApi {

    @GET("/forecast/webservice/json/v1")
    Observable<WeatherEntity> getWeather(@Query("city") final String city);

}
