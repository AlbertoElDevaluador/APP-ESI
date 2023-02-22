package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Vamos a coger todos los botones para instanciarlos en variables
         */
        var hay_buffer = false;
        var numero1 = 0;
        var numero2 = 0;


        val texto = findViewById<TextView>(R.id.buffer_text)
        val boton_0 = findViewById<Button>(R.id.boton_0)
        var boton_1 = findViewById<Button>(R.id.boton_1)
        val boton_2 = findViewById<Button>(R.id.boton_2)
        val boton_3 = findViewById<Button>(R.id.boton_3)
        val boton_4 = findViewById<Button>(R.id.boton_4)
        val boton_5 = findViewById<Button>(R.id.boton_5)
        val boton_6 = findViewById<Button>(R.id.boton_6)
        val boton_7 = findViewById<Button>(R.id.boton_7)
        val boton_8 = findViewById<Button>(R.id.boton_8)
        val boton_9 = findViewById<Button>(R.id.boton_9)

        val boton_suma = findViewById<Button>(R.id.boton_suma)
        val boton_igual = findViewById<Button>(R.id.boton_igual)
        val boton_div = findViewById<Button>(R.id.boton_div)
        val boton_mod = findViewById<Button>(R.id.boton_mod)


        /*
        We are going to program the logic of the calculator
         */
        boton_0.setOnClickListener{ tocado_numero()}
    }

    fun tocado_numero(hay_buffer: Boolean, numero: Double, numero1: Double, numero2: Double)
    {
        if(hay_buffer == false)
        {
            numero1 = numero;
        }else numero2 = numero;
    }
}

