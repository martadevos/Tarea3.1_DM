package com.example.tarea31_dm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.ContextCompat

class CambioImagenActivity : AppCompatActivity(), View.OnClickListener {
    //Declara variables de botones, image view, array con los nombres de las imagenes y posicion actual del array
    var imageBtnCambioImagen: ImageButton? = null
    var imagen: Int = R.drawable.cambia_imagen1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio_imagen)
        //Asigna las variables de los botones y la image view
        imageBtnCambioImagen = findViewById(R.id.imageBtnCambioImagen)
        //Pone la primera imagen en el boton
        imageBtnCambioImagen?.setImageResource(R.drawable.cambia_imagen1)
        //Pone un listener para el boton de imagen
        imageBtnCambioImagen?.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        if (p0?.id == imageBtnCambioImagen?.id) {
            imagen = when (imagen) {
                R.drawable.cambia_imagen1 -> R.drawable.cambia_imagen2
                else -> R.drawable.cambia_imagen1
            }
        }

        imageBtnCambioImagen?.setImageResource(imagen)
    }
}