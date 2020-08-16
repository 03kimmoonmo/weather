package com.example.weather

import retrofit2.http.GET

interface WeatherInterface {
    @GET("getUltraSrtFcst" +
            "?serviceKey=H91YqzYkgT2lriHxTcwyxDSYF%2BfTYZisyn" +
            "rPv9rIbH9aUFUAHvNK6FIB4nEEQTnlF%2F951s09Ax3GnHVNa3JtdA%" +
            "3D%3D&numOfRows=10&pageNo=1" +
            "&base_date=20200808&base_time=0630&nx=55&ny=127")
    fun GetWeather(): Call<WEATHER> // DATA CLASS
}