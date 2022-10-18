package com.example.tarea31_dm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SumaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)
        //Declarción del TextView de la suma y el botón para sumar
        val txtSuma: TextView? = findViewById(R.id.txtSuma)
        val btnSuma: Button? = findViewById(R.id.btnSuma)
        //Iniciará la acción cuando se pulse el botón
        btnSuma?.setOnClickListener {
            //Declarción de los dos EditText de sumandos
            val editText1: EditText? = findViewById(R.id.editTextSumando1)
            val editText2: EditText? = findViewById(R.id.editTextSumando2)
            //Extrae una cadena de texto de cada EditText
            val sumando1: String = editText1?.text.toString()
            val sumando2: String = editText2?.text.toString()
            //Pasa ambos sumandos a double y los suma
            val suma: Double = sumando1.toDouble() + sumando2.toDouble()
            //Devuelve la cadena a mostrar
            txtSuma?.text = "La suma es: $sumando1 + $sumando2 = $suma"
        }
    }
}