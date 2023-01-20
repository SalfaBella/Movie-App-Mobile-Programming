package com.example.movieapp.ui.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.movieapp.core.domain.usecase.movie.MovieUseCase

class TvShoViewModel(private val useCase: MovieUseCase): ViewModel() {
    fun getTvShow() = useCase.getTvShow().asLiveData()
}