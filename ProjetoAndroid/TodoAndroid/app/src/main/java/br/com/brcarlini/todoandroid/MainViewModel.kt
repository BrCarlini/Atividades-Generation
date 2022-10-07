package br.com.brcarlini.todoandroid

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.brcarlini.todoandroid.api.Repository
import br.com.brcarlini.todoandroid.model.Categoria
import br.com.brcarlini.todoandroid.model.Tarefa
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
        ): ViewModel() {




    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()


    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    private val _myTarefaResponse =
        MutableLiveData<Response<List<Tarefa>>>()

    val myTarefaResponse: LiveData<Response<List<Tarefa>>> =
        _myTarefaResponse

    val dataSelecionada = MutableLiveData<LocalDate>()


    init {
        //listCategoria()
    }


    fun listCategoria(){
        viewModelScope.launch {
            try {

                val response = repository.listCategoria()
                _myCategoriaResponse.value = response

            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun addTarefa(tarefa: Tarefa){
        viewModelScope.launch {
            try {
                repository.addTarefa(tarefa)
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun listTarefa(){
        viewModelScope.launch {
            try {
                val response = repository.listTarefa()
                _myTarefaResponse.value = response

            }catch (e: Exception) {
                Log.d("Erro", e.message.toString())
            }
        }
    }


}