package com.example.reportcityv3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
        private lateinit var Nome: EditText
        private lateinit var Senha: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Referenciar os elementos do layout
            Nome = findViewById(R.id.Nome_input)
            Senha = findViewById(R.id.Senha_input)
            val loginButton = findViewById<Button>(R.id.Entrar_input)

            // Definir o clique do botão de login
            loginButton.setOnClickListener {
                val username = Nome.text.toString()
                val password = Senha.text.toString()
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("nome", username)

                startActivity(intent)




            }
        }
    }

