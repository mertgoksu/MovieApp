package com.mertg.movieapp.domain.use_case.get_movie_detail

import com.mertg.movieapp.data.remote.dto.toMovieDetail
import com.mertg.movieapp.domain.model.MovieDetail
import com.mertg.movieapp.domain.repository.MovieRepository
import com.mertg.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject


class GetMovieDetailsUseCase @Inject constructor(private val repository : MovieRepository) {

    fun executeGetMovieDetails(imdbId: String) : Flow<Resource<MovieDetail>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId = imdbId).toMovieDetail()
            emit(Resource.Success(movieDetail))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error!"))
        } catch (e: IOError) {
            emit(Resource.Error(message = "Could not reach internet"))
        }
    }

}