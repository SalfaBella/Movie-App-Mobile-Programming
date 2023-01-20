package com.example.movieapp.core.utils

import com.example.movieapp.core.domain.model.Movie
import com.example.movieapp.core.domain.model.TvShow
import com.project.proyek_akhir_mobile_programming.core.data.remote.response.MovieResponse
import com.project.proyek_akhir_mobile_programming.core.data.remote.response.TvShowResponse

fun mapMovieResponseToDomain(input: MovieResponse) =
    Movie(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )

fun mapTvShowResponseToDomain(input: TvShowResponse) =
    TvShow(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )
