package com.example.reportcityv3

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.reportcityv3.R


class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(com.example.reportcityv3.R.layout.activity_main5);

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
