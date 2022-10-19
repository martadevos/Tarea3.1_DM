package com.example.tarea31_dm

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class GaleriaActivity : AppCompatActivity(), View.OnClickListener {
    //Declara variables de botones, image view, array con los nombres de las imagenes y posicion actual del array
    var btnAnterior: Button? = null
    var btnSiguiente:Button? = null
    var imageViewGaleria: ImageView? = null
    var arrayImagenes: Array<Int> = arrayOf(R.drawable.galeria1,
                                            R.drawable.galeria2,
                                            R.drawable.galeria3,
                                            R.drawable.galeria4,
                                            R.drawable.galeria5)
    var posicionArray: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)
        //Asigna las variables de los botones y la image view
        btnAnterior = findViewById(R.id.btnAnterior)
        btnSiguiente = findViewById(R.id.btnSiguiente)
        imageViewGaleria = findViewById(R.id.imageViewGaleria)
        //Pone un listener para los botones
        btnAnterior?.setOnClickListener(this)
        btnSiguiente?.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            btnAnterior?.id->{
                if (posicionArray>0) {
                    posicionArray --
                }else posicionArray+=4
            }
            btnSiguiente?.id->{
                if (posicionArray<4) {
                    posicionArray ++
                }else posicionArray -= 4
            }
        }

        imageViewGaleria?.setImageResource(arrayImagenes[posicionArray])
    }
}