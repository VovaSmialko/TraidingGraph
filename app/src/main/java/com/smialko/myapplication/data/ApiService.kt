package com.smialko.myapplication.data

import retrofit2.http.GET

interface ApiService {
    @GET("/v2/aggs/ticker/AAPL/range/1/hour/2022-01-09/2023-01-09?adjusted=true&sort=desc&limit=50000&apiKey=aJcINckE_iDWnXJhalNs_BsZr0PoUjYM")
    suspend fun loadBars(): Result
}