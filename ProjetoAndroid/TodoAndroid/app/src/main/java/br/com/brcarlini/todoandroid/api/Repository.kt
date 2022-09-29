package br.com.brcarlini.todoandroid.api

import br.com.brcarlini.todoandroid.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun  listCategoria(): Response<List<Categoria>> {
        return RetrofitInstance.api.listCategoria()
    }
}