package com.anesabml.quotey.core.interactors

import com.anesabml.quotey.core.data.IQuoteRepository
import com.anesabml.quotey.core.data.QuoteRepository
import com.anesabml.quotey.core.domain.Quote

class RemoveQuoteFromFavorite(private val quoteRepository: IQuoteRepository) {
    suspend operator fun invoke(quote: Quote) = quoteRepository.removeFromFavorites(quote)
}