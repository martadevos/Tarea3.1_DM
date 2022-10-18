package com.example.tarea31_dm

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView

class PropiedadesTextoActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    var checkBoxTextoNegrita: CheckBox? = null
    var checkBoxFuenteGigante: CheckBox? = null
    var checkBoxFuenteMinuscula: CheckBox? = null
    var checkBoxColorRojo: CheckBox? = null
    var textViewPropiedades: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_propiedades_texto)
        //Asigna los 4 checkBox y el textView
        checkBoxTextoNegrita = findViewById(R.id.checkBoxTextoNegrita)
        checkBoxFuenteGigante = findViewById(R.id.checkBoxFuenteGigante)
        checkBoxFuenteMinuscula = findViewById(R.id.checkBoxFuenteMinuscula)
        checkBoxColorRojo = findViewById(R.id.checkBoxColorRojo)
        textViewPropiedades = findViewById(R.id.textViewPropiedades)
        //Pone un listener para cuando cambia el check box seleccionado
        checkBoxTextoNegrita?.setOnCheckedChangeListener(this)
        checkBoxFuenteGigante?.setOnCheckedChangeListener(this)
        checkBoxFuenteMinuscula?.setOnCheckedChangeListener(this)
        checkBoxColorRojo?.setOnCheckedChangeListener(this)
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