package com.mertg.movieapp.data.remote.dto


import com.google.gson.annotations.SerializedName

data class MoviesDto(
    @SerializedName("Response")
    val response: String,
    @SerializedName("Search")
    val search: List<Search>,
    @SerializedName("totalResults")
    val totalResults: String
)