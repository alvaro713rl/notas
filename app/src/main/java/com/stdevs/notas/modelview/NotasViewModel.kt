package com.stdevs.notas.modelview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stdevs.notas.modelo.ModeloNotas
import com.stdevs.notas.modelo.Notas

class NotasViewModel(val modeloNotas : ModeloNotas) : ViewModel() {
    private val notasLiveData = MutableLiveData<List<Notas>>()

    fun setNotasData(listNotas: List<Notas>) {
        notasLiveData.value = listNotas
    }

    fun obtenerNotas(){
        setNotasData(modeloNotas.llenarNotas())
    }

    fun getNotasLiveData(): LiveData<List<Notas>> {
        return notasLiveData
    }
}