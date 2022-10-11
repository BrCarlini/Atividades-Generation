package br.com.brcarlini.todoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
E - Error (erro): identifica e exibe problemas que provocaram erros no aplicativo;

W - Warning (alerta): exibe alertas para problemas que ainda não são erros, mas que podem precisar
de atenção;

I - Info (informação): essa prioridade exibe mensagens de informação, são mensagens esperadas quando
está acontecendo um funcionamento regular do aplicativo. Geralmente, esse é o log que mais utilizamos, para verificar se algo está funcionando corretamente;

D - Debug: aqui conseguimos ver as mensagens de depuração, que são utilizadas durante o desenvolvimento
do aplicativo para verificar o fluxo exato que está acontecendo durante o funcionamento do aplicativo;

V - Verbose: utilizado para conferir mais detalhes sobre o funcionamento de uma parte específica ou
detalhar mais alguma informação coletada, por exemplo.

        */


    }
}