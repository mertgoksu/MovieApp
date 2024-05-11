package com.mertg.movieapp.domain.use_case.get_movies

import com.mertg.movieapp.data.remote.dto.toMovieList
import com.mertg.movieapp.domain.model.Movie
import com.mertg.movieapp.domain.repository.MovieRepository
import com.mertg.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError

import javax.inject.Inject


class GetMoviesUseCase @Inject constructor(private val repository : MovieRepository) {
    fun executeGetMovies(search: String) : Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if(movieList.Response.equals("True")) {
                emit(Resource.Success(movieList.toMovieList()))
            } else {
                emit(Resource.Error(message = "No movie found"))
            }
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error!"))
        } catch (e: IOError) {
            emit(Resource.Error(message = "Could not reach internet"))
        }
    }

}