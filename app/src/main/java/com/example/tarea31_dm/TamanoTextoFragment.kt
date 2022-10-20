package com.example.tarea31_dm

import android.os.Bundle
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
 * Use the [TamanoTextoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TamanoTextoFragment : Fragment(), View.OnClickListener {
    var editTextTamano: EditText? = null
    var btnMas: Button? = null
    var btnMenos: Button? = null
    var tamanoTexto: Float? = null
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
        val root =  inflater.inflate(R.layout.fragment_tamano_texto, container, false)
        //Declaración del texto para alinear y los botones de aumentar y disminuir
        editTextTamano= root.findViewById(R.id.editTextTamano)
        btnMas= root.findViewById(R.id.btnMas)
        btnMenos= root.findViewById(R.id.btnMenos)
        btnMas?.setOnClickListener(this)
        btnMenos?.setOnClickListener(this)
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TamanoTextoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TamanoTextoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClick(p0: View?) {
        tamanoTexto = editTextTamano?.textSize
        when(p0?.id){
            btnMas?.id -> editTextTamano?.textSize = tamanoTexto?.plus(1)!!
            btnMenos?.id -> editTextTamano?.textSize = tamanoTexto?.minus(1)!!
        }
    }
}