package br.com.aplicativofilmes.webclient.services

import br.com.aplicativofilmes.webclient.model.FilmeResposta
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FilmeService {
    @GET ("movie/popular")
    fun MoviePopular(
        @Query("api_key") key: String = "9106a44c761c36bbb02f24c16958a56a"): Call<FilmeResposta>

//    @GET ("/movie/{movie_id}?api_key=9106a44c761c36bbb02f24c16958a56a")
//    suspend fun getMovieId(@Path(value = "movie_id", encoded = true) movie_id : String): Call<JSONObject>
}