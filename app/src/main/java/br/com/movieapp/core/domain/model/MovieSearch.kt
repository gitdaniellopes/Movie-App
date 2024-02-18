package br.com.movieapp.core.domain.model

data class MovieSearch(
    val id: Int,
    val voteAverage: Double = 0.0,
    val imageUrl: String = ""
)
