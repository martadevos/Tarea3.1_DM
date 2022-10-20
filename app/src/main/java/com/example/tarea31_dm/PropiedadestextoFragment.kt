package com.example.tarea31_dm

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import com.example.tarea31_dm.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PropiedadestextoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PropiedadestextoFragment : Fragment(), CompoundButton.OnCheckedChangeListener {
    var checkBoxTextoNegrita: CheckBox? = null
    var checkBoxFuenteGigante: CheckBox? = null
    var checkBoxFuenteMinuscula: CheckBox? = null
    var checkBoxColorRojo: CheckBox? = null
    var textViewPropiedades: TextView? = null
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
        val root =  inflater.inflate(R.layout.fragment_propiedades_texto, container, false)
        //Asigna los 4 checkBox y el textView
        checkBoxTextoNegrita = root.findViewById(R.id.checkBoxTextoNegrita)
        checkBoxFuenteGigante = root.findViewById(R.id.checkBoxFuenteGigante)
        checkBoxFuenteMinuscula = root.findViewById(R.id.checkBoxFuenteMinuscula)
        checkBoxColorRojo = root.findViewById(R.id.checkBoxColorRojo)
        textViewPropiedades = root.findViewById(R.id.textViewPropiedades)
        //Pone un listener para cuando cambia el check box seleccionado
        checkBoxTextoNegrita?.setOnCheckedChangeListener(this)
        checkBoxFuenteGigante?.setOnCheckedChangeListener(this)
        checkBoxFuenteMinuscula?.setOnCheckedChangeListener(this)
        checkBoxColorRojo?.setOnCheckedChangeListener(this)
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PropiedadestextoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PropiedadestextoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        when (p0?.id) {
            checkBoxTextoNegrita?.id -> {
                if (p1) {
                    textViewPropiedades?.setTypeface(null, Typeface.BOLD)
                } else {
                    textViewPropiedades?.setTypeface(null, Typeface.NORMAL)
                }
            }
            checkBoxFuenteGigante?.id -> {
                if(p1){
                    textViewPropiedades?.textSize = 70F
                    checkBoxFuenteMinuscula?.isChecked = false
                }else if (checkBoxFuenteMinuscula?.isChecked == false) {
                    textViewPropiedades?.textSize = 25F
                }
            }
            checkBoxFuenteMinuscula?.id -> {
                if(p1){
                    textViewPropiedades?.textSize = 5F
                    checkBoxFuenteGigante?.isChecked = false
                }else if (checkBoxFuenteGigante?.isChecked == false) {
                    textViewPropiedades?.textSize = 25F
                }
            }
            checkBoxColorRojo?.id -> {
                if (p1) {
                    textViewPropiedades?.setTextColor(Color.RED)
                } else {
                    textViewPropiedades?.setTextColor(Color.BLACK)
                }
            }
        }
    }
}