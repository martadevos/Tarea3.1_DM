package com.example.tarea31_dm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class TamanoTextoActivity : AppCompatActivity(), View.OnClickListener {
    var editTextTamano: EditText? = null
    var btnMas: Button? = null
    var btnMenos: Button? = null
    var tamanoTexto: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamano_texto)
        //Declaración del texto para alinear y los botones de aumentar y disminuir
        editTextTamano= findViewById(R.id.editTextTamano)
        btnMas= findViewById(R.id.btnMas)
        btnMenos= findViewById(R.id.btnMenos)
        btnMas?.setOnClickListener(this)
        btnMenos?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        tamanoTexto = editTextTamano?.textSize
        when(p0?.id){
            btnMas?.id -> editTextTamano?.textSize = tamanoTexto?.plus(1)!!
            btnMenos?.id -> editTextTamano?.textSize = tamanoTexto?.minus(1)!!
        }
    }
}