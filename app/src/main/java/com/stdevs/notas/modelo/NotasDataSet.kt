package com.stdevs.notas.modelo

class NotasDataSet {

    fun crearNotasCurso():List<Notas>{
        return listOf(
            Notas("juan", "matematica", 50),
            Notas("pablo", "matematica", 80),
            Notas("daniela", "matematica", 90),
            Notas("pedro", "matematica", 100),
            Notas("gabriela", "matematica", 95),
            Notas("juan", "fisica", 74),
            Notas("pablo", "fisica", 99),
            Notas("daniela", "fisica", 100),
            Notas("pedro", "fisica", 86),
            Notas("gabriela", "fisica", 64),
            Notas("juan", "quimica", 75),
            Notas("pablo", "quimica", 80),
            Notas("daniela", "quimica", 92),
            Notas("pedro", "quimica", 100),
            Notas("gabriela", "quimica", 79)

        )

    }
}