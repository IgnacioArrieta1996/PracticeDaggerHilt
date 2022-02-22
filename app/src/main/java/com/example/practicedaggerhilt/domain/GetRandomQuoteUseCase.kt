package com.example.practicedaggerhilt.domain


import com.example.practicedaggerhilt.data.model.QuoteModel
import com.example.practicedaggerhilt.data.model.QuoteProvider
import com.example.practicedaggerhilt.ui.viewmodel.QuoteViewModel
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider:QuoteProvider) {

    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }

}