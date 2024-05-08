package com.mertg.movieapp.data.remote

import com.mertg.movieapp.data.remote.dto.MovieDetailDto
import com.mertg.movieapp.data.remote.dto.MoviesDto
import com.mertg.movieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {
    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apiKey: String = API_KEY
    ) : MoviesDto

    suspend fun getMovieDetail(
        @Query("i") imdbId: String,
        @Query("apikey") apiKey: String = API_KEY
    ) : MovieDetailDto
}