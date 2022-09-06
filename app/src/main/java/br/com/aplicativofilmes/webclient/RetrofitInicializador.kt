package br.com.aplicativofilmes.webclient

import br.com.aplicativofilmes.webclient.services.FilmeService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInicializador {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val notaService = retrofit.create(FilmeService::class.java)
}