package com.example.tarea31_dm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class TamanoTextoFragment : Fragment(), View.OnClickListener {
    var editTextTamano: EditText? = null
    var btnMas: Button? = null
    var btnMenos: Button? = null
    var tamanoTexto: Float? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_tamano_texto, container, false)
        //Declaración del texto para alinear y los botones de aumentar y disminuir
        editTextTamano= root.findViewById(R.id.editTextTamano)
        btnMas= root.findViewById(R.id.btnMas)
        btnMenos= root.findViewById(R.id.btnMenos)
        btnMas?.setOnClickListener(this)
        btnMenos?.setOnClickListener(this)
        return root
    }


    override fun onClick(p0: View?) {
        tamanoTexto = editTextTamano?.textSize
        when(p0?.id){
            btnMas?.id -> editTextTamano?.textSize = tamanoTexto?.plus(1)!!
            btnMenos?.id -> editTextTamano?.textSize = tamanoTexto?.minus(1)!!
        }
    }
}