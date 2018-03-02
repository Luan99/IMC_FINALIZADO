package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //!! executa a ação não importa oque aconteca
        //? chamada de segurança, evita no pointer exception

        //para nao dar erro em edittext, colocar o nome em textinputlayout

        btCalcular.setOnClickListener{
            val telaResultado = Intent(this,
                    ResultadoActivity::class.java)


            //chamando os dados da outra tela e fazendo aparecer já.
            telaResultado.putExtra("PESO", inputPeso.editText?.text.toString())

            telaResultado.putExtra("ALTURA", inputAltura.editText?.text.toString())

            startActivity(telaResultado)
        }



        btLimpar.setOnClickListener{
          inputAltura.editText?.setText("")
          inputPeso.editText?.setText("")
        }

    }
}
