package br.com.movieapp.data.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class ProductionCompany(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("logo_path")
    val logoPath: String,
    @SerializedName("origin_country")
    val originCountry: String
)