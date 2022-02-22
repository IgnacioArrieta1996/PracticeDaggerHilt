package com.example.practicedaggerhilt.domain

import com.example.practicedaggerhilt.data.QuoteRepository
import com.example.practicedaggerhilt.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}