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

class ColorTextoFragment : Fragment(), CompoundButton.OnCheckedChangeListener {
    var radioButtonRojo: RadioButton? = null
    var radioButtonAzul: RadioButton? = null
    var radioButtonVerde: RadioButton? = null
    var editTextCambioColor: EditText? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_color_texto, container, false)

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

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        if (radioButtonRojo?.isChecked == true) editTextCambioColor?.setTextColor(Color.RED)
        if (radioButtonAzul?.isChecked == true) editTextCambioColor?.setTextColor(Color.BLUE)
        if (radioButtonVerde?.isChecked == true) editTextCambioColor?.setTextColor(Color.GREEN)
    }
}