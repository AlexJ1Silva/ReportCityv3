package com.example.reportcityv3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Recuperar  o nome do extra
        val nomeRecebido = intent.getStringExtra("nome")

        // Encontrar o  TextView pelo ID
        val tvSubtitle = findViewById<TextView>(R.id.tvSubtitle)

        // Exibir a mensagem de boas-vindas
        tvSubtitle.text = "Bem-vindo, $nomeRecebido!"

        // Referenciar o elementos
        val teste = findViewById<Button>(R.id.reportar_input)

        // Definir o clique do botão de login
        teste.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
