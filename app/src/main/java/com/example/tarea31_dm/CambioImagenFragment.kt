package com.example.tarea31_dm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class CambioImagenFragment : Fragment(), View.OnClickListener {
    //Declara variables de botones, image view, array con los nombres de las imagenes y posicion actual del array
    var imageBtnCambioImagen: ImageButton? = null
    var imagen: Int = R.drawable.cambia_imagen1


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_cambio_imagen, container, false)
        //Asigna las variables de los botones y la image view
        imageBtnCambioImagen = root.findViewById(R.id.imageBtnCambioImagen)
        //Pone la primera imagen en el boton
        imageBtnCambioImagen?.setImageResource(R.drawable.cambia_imagen1)
        //Pone un listener para el boton de imagen
        imageBtnCambioImagen?.setOnClickListener(this)
        return root
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