package com.example.tarea31_dm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SumaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)
        //Declarción del TextView de la suma y el botón para sumar
        val txtSuma: TextView? = findViewById(R.id.txtSuma)
        val btnSuma: Button? = findViewById(R.id.btnSuma)
        //Iniciará la acción cuando se pulse el botón
        btnSuma?.setOnClickListener {
            //Declarción de los dos EditText de sumandos
            val editText1: EditText? = findViewById(R.id.editTextSumando1)
            val editText2: EditText? = findViewById(R.id.editTextSumando2)
            //Extrae una cadena de texto de cada EditText
            val sumando1: String = editText1?.text.toString()
            val sumando2: String = editText2?.text.toString()
            //Pasa ambos sumandos a double y los suma
            val suma: Double = sumando1.toDouble() + sumando2.toDouble()
            //Devuelve la cadena a mostrar
            txtSuma?.text = "La suma es: $sumando1 + $sumando2 = $suma"
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Hace que cada opción del menú lleve a su correspondiente página al pulsarlo
        return when (item.itemId) {
            R.id.inicio -> {
                val intent = Intent(this, MainActivity::class.java)
                setContentView(R.layout.activity_inicio)
                true
            }
            R.id.suma -> {
                val intent = Intent(this, SumaActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.galeria -> {
                val intent = Intent(this, GaleriaActivity::class.java)
                true
            }
            R.id.cambioImagen -> {
                val intent = Intent(this, CambioImagenActivity::class.java)
                true
            }
            R.id.colorearTexto -> {
                val intent = Intent(this, ColorTextoActivity::class.java)
                true
            }
            R.id.alinearTexto -> {
                val intent = Intent(this, AlinearTextoActivity::class.java)
                true
            }
            R.id.tamanoTexto -> {
                val intent = Intent(this, TamanoTextoActivity::class.java)
                true
            }
            R.id.propiedadesTexto -> {
                val intent = Intent(this, PropiedadesTextoActivity::class.java)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}