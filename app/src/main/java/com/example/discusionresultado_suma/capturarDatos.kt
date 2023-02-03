package com.example.discusionresultado_suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class capturarDatos : AppCompatActivity() {

    private lateinit var txtResultadoCapturar : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capturar_datos)

        txtResultadoCapturar = findViewById<TextView>(R.id.txtResultadoCalculado)

        var bundle = intent.extras
        val result = bundle?.get("Resultado")

        txtResultadoCapturar.setText("El Resultado es: ${result.toString()}")
    }
}