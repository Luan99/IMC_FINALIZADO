package com.example.logonrm.imc

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.logonrm.imc.Extension.format
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if (intent != null) {
            val peso = intent.getStringExtra("PESO").toDouble()
            val altura = intent.getStringExtra("ALTURA").toDouble()

            val imc = peso / (altura * altura)

            tvValorIMC.setText(imc.format(digits = 1))

            if (imc <= 18.5) {
                alteraImagem(R.drawable.magreza)
                tvStatusIMC.text = "crackudo"
            } else if (imc <= 24.9) {
                alteraImagem(R.drawable.abaixo)
                tvStatusIMC.text = "abaixo do peso"
            } else if (imc <= 29.9) {
                alteraImagem(R.drawable.ideal)
                tvStatusIMC.text = "Ideal"
            } else if (imc <= 34.9) {
                alteraImagem(R.drawable.sobre)
                tvStatusIMC.text = "sobre peso"
            } else if (imc <= 39.9) {
                alteraImagem(R.drawable.obesidade)
                tvStatusIMC.text = "Obesidade"
            }

        }
    }

    fun alteraImagem(IdImagem: Int) {
        ivStatusIMC.setImageDrawable(ContextCompat.getDrawable(this,
                IdImagem))
    }
}











