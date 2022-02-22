package com.example.practicedaggerhilt.data.network

import com.example.practicedaggerhilt.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes() : Response<List<QuoteModel>>

}