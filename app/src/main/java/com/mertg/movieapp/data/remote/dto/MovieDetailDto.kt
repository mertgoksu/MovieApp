package com.mertg.movieapp.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.mertg.movieapp.domain.model.Movie
import com.mertg.movieapp.domain.model.MovieDetail

data class MovieDetailDto(
    val Actors: String,
    val Awards: String,
    val BoxOffice: String,
    val Country: String,
    val DVD: String,
    val Director: String,
    val Genre: String,
    val imdbID: String,
    val imdbRating: String,
    val imdbVotes: String,
    val Language: String,
    val Metascore: String,
    val Plot: String,
    val Poster: String,
    val Production: String,
    val Rated: String,
    val Ratings: List<Rating>,
    val Released: String,
    val Response: String,
    val Runtime: String,
    val Title: String,
    val Type: String,
    val Website: String,
    val Writer: String,
    val Year: String
)

fun MovieDetailDto.toMovieDetail() : MovieDetail{
    return MovieDetail(Actors, Awards, Country, Director, Genre, imdbRating, Language, Poster, Rated, Released, Title, Type, Year)
}