package com.example.tarea31_dm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tarea31_dm.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SumaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SumaFragment : Fragment() {
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
        val root =  inflater.inflate(R.layout.fragment_suma, container, false)
        //Declarción del TextView de la suma y el botón para sumar
        val txtSuma: TextView? = root.findViewById(R.id.txtSuma)
        val btnSuma: Button? = root.findViewById(R.id.btnSuma)
        //Iniciará la acción cuando se pulse el botón
        btnSuma?.setOnClickListener {
            //Declarción de los dos EditText de sumandos
            val editText1: EditText? = root.findViewById(R.id.editTextSumando1)
            val editText2: EditText? = root.findViewById(R.id.editTextSumando2)
            //Extrae una cadena de texto de cada EditText
            val sumando1: String = editText1?.text.toString()
            val sumando2: String = editText2?.text.toString()
            //Pasa ambos sumandos a double y los suma
            val suma: Double = sumando1.toDouble() + sumando2.toDouble()
            //Devuelve la cadena a mostrar
            txtSuma?.text = "La suma es: $sumando1 + $sumando2 = $suma"

        }
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SumaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SumaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}