package com.example.tarea31_dm

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.RadioButton
import com.example.tarea31_dm.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ColorTextoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ColorTextoFragment : Fragment(), CompoundButton.OnCheckedChangeListener {
    var radioButtonRojo: RadioButton? = null
    var radioButtonAzul: RadioButton? = null
    var radioButtonVerde: RadioButton? = null
    var editTextCambioColor: EditText? = null
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
        val root =  inflater.inflate(R.layout.fragment_color_texto, container, false)

        //Asigna el texto a colorear y los radioButtons de cambiar los colores
        editTextCambioColor = root.findViewById(R.id.editTextCambioColor)
        radioButtonRojo = root.findViewById(R.id.radioButtonRojo)
        radioButtonAzul = root.findViewById(R.id.radioButtonAzul)
        radioButtonVerde = root.findViewById(R.id.radioButtonVerde)
        //Pone un listener para cuando cambia el radio button seleccionado
        radioButtonRojo?.setOnCheckedChangeListener(this)
        radioButtonAzul?.setOnCheckedChangeListener(this)
        radioButtonVerde?.setOnCheckedChangeListener(this)
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ColorTextoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ColorTextoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        when (p0?.id) {
            radioButtonRojo?.id -> editTextCambioColor?.setTextColor(Color.RED)
            radioButtonAzul?.id -> editTextCambioColor?.setTextColor(Color.BLUE)
            radioButtonVerde?.id -> editTextCambioColor?.setTextColor(Color.GREEN)
        }
    }
}