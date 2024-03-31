package com.smialko.myapplication.data

import com.smialko.myapplication.presentation.TimeFrame
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/v2/aggs/ticker/AAPL/range/{timeframe}/2022-01-09/2023-01-09?adjusted=true&sort=desc&limit=50000&apiKey=aJcINckE_iDWnXJhalNs_BsZr0PoUjYM")
    suspend fun loadBars(
        @Path("timeframe") timeFrame: String
    ): Result
}