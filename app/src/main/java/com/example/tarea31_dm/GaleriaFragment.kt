package com.example.tarea31_dm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class GaleriaFragment : Fragment(), View.OnClickListener {
    //Declara variables de botones, image view, array con los nombres de las imagenes y posicion actual del array
    var btnAnterior: Button? = null
    var btnSiguiente: Button? = null
    var imageViewGaleria: ImageView? = null
    var arrayImagenes: Array<Int> = arrayOf(R.drawable.galeria1,
        R.drawable.galeria2,
        R.drawable.galeria3,
        R.drawable.galeria4,
        R.drawable.galeria5)
    var posicionArray: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_galeria, container, false)
        //Asigna las variables de los botones y la image view
        btnAnterior = root.findViewById(R.id.btnAnterior)
        btnSiguiente = root.findViewById(R.id.btnSiguiente)
        imageViewGaleria = root.findViewById(R.id.imageViewGaleria)
        //Pone un listener para los botones
        btnAnterior?.setOnClickListener(this)
        btnSiguiente?.setOnClickListener(this)
        return root
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