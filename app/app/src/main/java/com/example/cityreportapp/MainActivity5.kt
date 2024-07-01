package com.example.cityreportapp

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(com.example.cityreportapp.R.layout.activity_main5);

        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                // após temporizador terminar (depois de 5 segundos)redirecionará o usuário para a próxima tela
                val intent = Intent(this@MainActivity5, MainActivity3::class.java)
                startActivity(intent)
                finish() // encerrará a tela atual
            }
        }.start()
    }
}
