
package com.example.pausafacil

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Localizando os cartões

        val btnWater =
            findViewById<LinearLayout>(R.id.btnWater)

        val btnHelp =
            findViewById<LinearLayout>(R.id.btnHelp)

        val btnHappy =
            findViewById<LinearLayout>(R.id.btnHappy)

        val btnPause =
            findViewById<LinearLayout>(R.id.btnPause)

        // Localizando a área de mensagem

        val txtSelectedMessage =
            findViewById<TextView>(R.id.txtSelectedMessage)

        // Configurando os cliques

        btnWater.setOnClickListener {
            txtSelectedMessage.text = "Quero água"
        }

        btnHelp.setOnClickListener {
            txtSelectedMessage.text = "Preciso de ajuda"
        }

        btnHappy.setOnClickListener {
            txtSelectedMessage.text = "Estou feliz"
        }

        btnPause.setOnClickListener {
            txtSelectedMessage.text = "Quero uma pausa"
        }
    }
}