package com.example.discusionresultado_suma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var txtNum1 : EditText
    private lateinit var txtNum2 : EditText
    private lateinit var btnEnviar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNum1 = findViewById<EditText>(R.id.txtNum1)
        txtNum2 = findViewById<EditText>(R.id.txtNum2)

        btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            this.Enviar(txtNum1.text.toString().trim(), txtNum2.text.toString().trim())
        }
    }


    fun Enviar(num1: String,num2: String){
        var producto : Int

        if (num1.toString().isEmpty() || num2.toString().isEmpty()) {
            Toast.makeText(this, "Debe completar los datos", Toast.LENGTH_SHORT).show()
        }else{
            producto = Integer.parseInt(num1) + Integer.parseInt(num2)
            var intent = Intent(this, capturarDatos::class.java) //llama una pantalla nueva
            intent.putExtra("Resultado", producto)
            startActivity(intent)
        }
    }
}