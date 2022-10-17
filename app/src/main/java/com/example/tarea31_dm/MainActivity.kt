package com.example.tarea31_dm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Hace que cada opción del menú lleve a su correspondiente página y actividad al pulsarlo
        return when (item.itemId) {
            R.id.inicio -> {
                val intent = Intent(this, MainActivity::class.java)
                true
            }
            R.id.suma -> {
                val intent = Intent(this, SumaActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.galeria -> {
                val intent = Intent(this, GaleriaActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.cambioImagen -> {
                val intent = Intent(this, CambioImagenActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.colorearTexto -> {
                val intent = Intent(this, ColorTextoActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.alinearTexto -> {
                val intent = Intent(this, AlinearTextoActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.tamanoTexto -> {
                val intent = Intent(this, TamanoTextoActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.propiedadesTexto -> {
                val intent = Intent(this, PropiedadesTextoActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
