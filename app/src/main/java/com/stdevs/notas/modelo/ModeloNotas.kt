package com.stdevs.notas.modelo

class ModeloNotas {

    private val notasDataSet = NotasDataSet()

    fun llenarNotas():List<Notas>{

        return notasDataSet.crearNotasCurso()
    }
}