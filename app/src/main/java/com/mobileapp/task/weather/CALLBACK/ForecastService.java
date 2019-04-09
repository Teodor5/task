package com.mobileapp.task.weather.CALLBACK;

import com.mobileapp.task.weather.POJO.WeatherPOJO;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface ForecastService {

    @GET("2.5/forecast")
    Call<WeatherPOJO> getForecast(@Query("lat") double lat,
                                 @Query("lon") double lon,
                                 @Query("units") String units,
                                 @Query("appid") String appid);

}
