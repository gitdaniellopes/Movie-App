package br.com.movieapp.core.data.remote.response

import br.com.movieapp.core.data.remote.model.BelongsToCollection
import br.com.movieapp.core.data.remote.model.Genre
import br.com.movieapp.core.data.remote.model.ProductionCompany
import br.com.movieapp.core.data.remote.model.ProductionCountry
import br.com.movieapp.core.data.remote.model.SpokenLanguage
import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("adult")
    val backdropPath: String,
    @SerializedName("adult")
    val belongsToCollection: BelongsToCollection,
    @SerializedName("adult")
    val budget: Int,
    @SerializedName("adult")
    val genres: List<Genre>,
    @SerializedName("adult")
    val homepage: String,
    @SerializedName("adult")
    val id: Int,
    @SerializedName("adult")
    val imdbId: String,
    @SerializedName("adult")
    val originalLanguage: String,
    @SerializedName("adult")
    val originalTitle: String,
    @SerializedName("adult")
    val overview: String,
    @SerializedName("adult")
    val popularity: Double,
    @SerializedName("adult")
    val posterPath: String,
    @SerializedName("adult")
    val productionCompanies: List<ProductionCompany>,
    @SerializedName("adult")
    val productionCountries: List<ProductionCountry>,
    @SerializedName("adult")
    val releaseDate: String,
    @SerializedName("adult")
    val revenue: Long,
    @SerializedName("adult")
    val runtime: Int,
    @SerializedName("adult")
    val spokenLanguages: List<SpokenLanguage>,
    @SerializedName("adult")
    val status: String,
    @SerializedName("adult")
    val tagline: String,
    @SerializedName("adult")
    val title: String,
    @SerializedName("adult")
    val video: Boolean,
    @SerializedName("adult")
    val voteAverage: Double,
    @SerializedName("adult")
    val voteCount: Int
)