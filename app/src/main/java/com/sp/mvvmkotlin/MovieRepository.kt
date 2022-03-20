package com.sp.mvvmkotlin

class MovieRepository constructor(private val movieService: MovieService) {
    fun getAllMovies() = movieService.getAllMovies()
}