package br.com.aplicativofilmes.model

data class Filmes(
    val id: Int,
    val originalLanguage: String,
    val overview: String,
    val poster: String,
    val releaseDate: String,
    val title: String,
    val voteAverage: Int
)
