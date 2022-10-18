package com.example.tarea31_dm

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ColorTextoActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    var radioButtonRojo: RadioButton? = null
    var radioButtonAzul: RadioButton? = null
    var radioButtonVerde: RadioButton? = null
    var editTextCambioColor: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_texto)
        //Declara el texto a colorear, el boton para cambiar de color y los radioButtons de los colores
        editTextCambioColor = findViewById(R.id.editTextCambioColor)
        radioButtonRojo = findViewById(R.id.radioButtonRojo)
        radioButtonAzul = findViewById(R.id.radioButtonAzul)
        radioButtonVerde = findViewById(R.id.radioButtonVerde)
        radioButtonRojo?.setOnCheckedChangeListener(this)
        radioButtonAzul?.setOnCheckedChangeListener(this)
        radioButtonVerde?.setOnCheckedChangeListener(this)
        //Si se pulsa el botón de cambiar color, cambia el color del texto al color que esté seleccionado

    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        when (p0?.id) {
            radioButtonRojo?.id -> editTextCambioColor?.setTextColor(Color.RED)
            radioButtonAzul?.id -> editTextCambioColor?.setTextColor(Color.BLUE)
            radioButtonVerde?.id -> editTextCambioColor?.setTextColor(Color.GREEN)
        }
    }

}

