package com.example.tarea31_dm

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ColorTextoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_texto)
        //Declara el texto a colorear, el boton para cambiar de color y los radioButtons de los colores
        val editTextCambioColor: EditText? = findViewById(R.id.editTextCambioColor)
        val radioButtonRojo: RadioButton? = findViewById(R.id.radioButtonRojo)
        val radioButtonAzul: RadioButton? = findViewById(R.id.radioButtonAzul)
        val radioButtonVerde: RadioButton? = findViewById(R.id.radioButtonVerde)
        val btnCambiarColor: Button? = findViewById(R.id.btnCambiarColor)
        //Si se pulsa el botón de cambiar color, cambia el color del texto al color que esté seleccionado
        btnCambiarColor?.setOnClickListener {
            if (radioButtonRojo?.isChecked == true){
                editTextCambioColor?.setTextColor(Color.RED)
            }else if (radioButtonAzul?.isChecked == true){
                editTextCambioColor?.setTextColor(Color.BLUE)
            }else if (radioButtonVerde?.isChecked == true){
                editTextCambioColor?.setTextColor(Color.GREEN)
            }
        }
    }

}
