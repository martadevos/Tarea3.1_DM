package com.example.tarea31_dm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SumaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_suma, container, false)
        //Declarción del TextView de la suma y el botón para sumar
        val txtSuma: TextView? = root.findViewById(R.id.txtSuma)
        val btnSuma: Button? = root.findViewById(R.id.btnSuma)
        //Iniciará la acción cuando se pulse el botón
        btnSuma?.setOnClickListener {
            //Declarción de los dos EditText de sumandos
            val editText1: EditText? = root.findViewById(R.id.editTextSumando1)
            val editText2: EditText? = root.findViewById(R.id.editTextSumando2)
            //Extrae una cadena de texto de cada EditText
            val sumando1: String = editText1?.text.toString()
            val sumando2: String = editText2?.text.toString()
            //Pasa ambos sumandos a double y los suma
            val suma: Double = sumando1.toDouble() + sumando2.toDouble()
            //Devuelve la cadena a mostrar
            val textoResultado = "La suma es: $sumando1 + $sumando2 = $suma"
            txtSuma?.text = textoResultado

        }
        return root
    }

}