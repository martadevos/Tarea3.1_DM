package com.example.tarea31_dm

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.tarea31_dm.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlinearTextoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlinearTextoFragment : Fragment(), View.OnClickListener {
    var editTextTextAlinear: EditText? = null
    var btnDcha: Button? = null
    var btnIzda: Button? = null
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
        val root=  inflater.inflate(R.layout.fragment_alinear_texto, container, false)
        //Declaración del texto para alinear y los botones de izquierda y derecha
        editTextTextAlinear= root.findViewById(R.id.editTextTextAlinear)
        btnDcha= root.findViewById(R.id.btnDcha)
        btnIzda= root.findViewById(R.id.btnIzda)
        btnDcha?.setOnClickListener(this)
        btnIzda?.setOnClickListener(this)
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AlinearTextoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AlinearTextoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            btnDcha?.id -> editTextTextAlinear?.gravity = Gravity.END
            btnIzda?.id -> editTextTextAlinear?.gravity = Gravity.START
        }
    }
}