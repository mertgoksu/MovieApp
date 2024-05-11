package com.mertg.movieapp.presentation.movie_detail

import com.mertg.movieapp.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)