package com.example.tarea31_dm

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class AlinearTextoFragment : Fragment(), View.OnClickListener {
    var editTextTextAlinear: EditText? = null
    var btnDcha: Button? = null
    var btnIzda: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root=  inflater.inflate(R.layout.fragment_alinear_texto, container, false)
        //Declaración del texto para alinear y los botones de izquierda y derecha
        editTextTextAlinear= root.findViewById(R.id.editTextTextAlinear)
        btnDcha= root.findViewById(R.id.btnDcha)
        btnIzda= root.findViewById(R.id.btnIzda)
        btnDcha?.setOnClickListener(this)
        btnIzda?.setOnClickListener(this)
        return root
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            btnDcha?.id -> editTextTextAlinear?.gravity = Gravity.END
            btnIzda?.id -> editTextTextAlinear?.gravity = Gravity.START
        }
    }
}