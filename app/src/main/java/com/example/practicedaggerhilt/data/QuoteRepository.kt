package com.example.practicedaggerhilt.data

import com.example.practicedaggerhilt.data.model.QuoteModel
import com.example.practicedaggerhilt.data.model.QuoteProvider
import com.example.practicedaggerhilt.data.network.QuoteService
import javax.inject.Inject

//Clase encargada de gestionar si accedemos a la parte de network o database si existiese
class QuoteRepository @Inject constructor(private val api: QuoteService, private val quoteProvider: QuoteProvider) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response: List<QuoteModel> = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }

}