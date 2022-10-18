package com.example.tarea31_dm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText

class AlinearTextoActivity : AppCompatActivity(), View.OnClickListener {
    var editTextTextAlinear: EditText? = null
    var btnDcha: Button? = null
    var btnIzda: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alinear_texto)
        //Declaración del texto para alinear y los botones de izquierda y derecha
        editTextTextAlinear= findViewById(R.id.editTextTextAlinear)
        btnDcha= findViewById(R.id.btnDcha)
        btnIzda= findViewById(R.id.btnIzda)
        btnDcha?.setOnClickListener(this)
        btnIzda?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            btnDcha?.id -> editTextTextAlinear?.gravity = Gravity.END
            btnIzda?.id -> editTextTextAlinear?.gravity = Gravity.START
        }
    }
}