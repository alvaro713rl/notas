package com.stdevs.notas.modelview

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.stdevs.notas.modelo.ModeloNotas

class MyViewModelFactory(val modeloNotas: ModeloNotas): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(ModeloNotas::class.java).newInstance(modeloNotas)
    }
}