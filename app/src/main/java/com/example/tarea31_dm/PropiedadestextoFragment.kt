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

class PropiedadestextoFragment : Fragment(), CompoundButton.OnCheckedChangeListener {
    var checkBoxTextoNegrita: CheckBox? = null
    var checkBoxFuenteGigante: CheckBox? = null
    var checkBoxFuenteMinuscula: CheckBox? = null
    var checkBoxColorRojo: CheckBox? = null
    var textViewPropiedades: TextView? = null

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