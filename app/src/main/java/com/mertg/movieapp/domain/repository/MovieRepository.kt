package com.mertg.movieapp.domain.repository

import com.mertg.movieapp.data.remote.dto.MovieDetailDto
import com.mertg.movieapp.data.remote.dto.MoviesDto


interface MovieRepository {
    suspend fun getMovies(search: String) : MoviesDto
    suspend fun getMovieDetail(imdbId: String) : MovieDetailDto
}