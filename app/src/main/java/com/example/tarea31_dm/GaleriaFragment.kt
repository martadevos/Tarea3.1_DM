package com.example.tarea31_dm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.example.tarea31_dm.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GaleriaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

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

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GaleriaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GaleriaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
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