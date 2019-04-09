package com.mobileapp.task.weather.CALLBACK;

import com.mobileapp.task.weather.POJO.WeatherPOJO;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface WeatherService {

    @GET("2.5/weather")
    Call<WeatherPOJO> getWeather(@Query("lat") double lat,
                                       @Query("lon") double lon,
                                       @Query("units") String units,
                                       @Query("appid") String appid);

}
