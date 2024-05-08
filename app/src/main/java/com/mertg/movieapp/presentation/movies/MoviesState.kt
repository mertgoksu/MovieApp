package com.mertg.movieapp.presentation.movies

import com.mertg.movieapp.domain.model.Movie

data class MoviesState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "batman"
    )
