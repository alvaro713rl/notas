package com.stdevs.notas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.ListView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.stdevs.notas.R
import com.stdevs.notas.modelo.ModeloNotas
import com.stdevs.notas.modelo.Notas
import com.stdevs.notas.modelview.MyViewModelFactory
import com.stdevs.notas.modelview.NotasViewModel

class MainActivity : AppCompatActivity() {

    var cbJuan:CheckBox? = null
    var cbPablo:CheckBox? = null
    var cbDaniela:CheckBox? = null
    var cbPedro:CheckBox? = null
    var cbGabriela:CheckBox? = null
   // var laLista:ListView?= null

    private lateinit var viewModel: NotasViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbJuan = findViewById(R.id.cbJuan)
        cbPablo = findViewById(R.id.cbPablo)
        cbDaniela = findViewById(R.id.cbDaniela)
        cbPedro = findViewById(R.id.cbPedro)
        cbGabriela = findViewById(R.id.cbGabriela)

        val laLista = findViewById<ListView>(R.id.laLista)

        //val lista = listOf("alvaro", "antonio", "reyes", "linares")
       // val adaptador1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)
        //laLista.adapter= adaptador1

        viewModel = ViewModelProviders.of(this, MyViewModelFactory(ModeloNotas())).get(NotasViewModel::class.java)

        val observer: Observer<List<Notas>> = Observer {
         //  var res1:String =""
        //for(valor in it){
          //  res1 = res1 +valor.alumno
        //}
          //  Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()

         val listaMostrar = it
            val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaMostrar)
            laLista.adapter = adaptador
        }

        viewModel.getNotasLiveData().observe(this, observer)

    }

    fun onClick(view: View) {
        viewModel.obtenerNotas()
    }
}