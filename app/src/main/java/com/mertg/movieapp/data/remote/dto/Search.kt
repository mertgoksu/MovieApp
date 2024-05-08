package com.mertg.movieapp.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Search(
    val imdbID: String,
    val Poster: String,
    val Title: String,
    val Type: String,
    val Year: String
)