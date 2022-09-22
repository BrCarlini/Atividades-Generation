package br.com.brcarlini.projetogen3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        findViewById()
        */

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        // Ação para o Dado de 6 lados
        buttonD6.setOnClickListener {
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }


        // Ação para o Dado de 12 lados
        buttonD12.setOnClickListener {
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(12)
        }


        // Ação para o Dado de 20 lados
        buttonD20.setOnClickListener {
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(20)
        }
    }



    private fun rolarDados(lados: Int) {
        val aleat = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        //val imageDado = findViewById<ImageView>(R.id.imageDice)

        textDado.text = aleat.toString()

//        when(lados){
//
//            6 -> {
//                when(aleat){
//                    1 -> imageDado.setImageDrawable(R.drawable.ic_dice_d6_solid)
//                }
//            }
//        }
    }
}


