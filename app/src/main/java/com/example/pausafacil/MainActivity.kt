package com.example.pausafacil

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pausafacil.data.model.CommunicationCard
import com.example.pausafacil.data.repository.CommunicationCardRepository
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    // Guarda a posição da próxima mensagem de cada cartão
    private val messageIndexes = mutableMapOf<Int, Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Buscando os dados no Repository
        val repository = CommunicationCardRepository()
        val cards = repository.getCards()

        // Localizando os cartões no XML
        val btnWater = findViewById<LinearLayout>(R.id.btnWater)
        val btnHelp = findViewById<LinearLayout>(R.id.btnHelp)
        val btnHappy = findViewById<LinearLayout>(R.id.btnHappy)
        val btnPause = findViewById<LinearLayout>(R.id.btnPause)

        // Localizando os textos no XML
        val txtWater = findViewById<TextView>(R.id.txtWater)
        val txtHelp = findViewById<TextView>(R.id.txtHelp)
        val txtHappy = findViewById<TextView>(R.id.txtHappy)
        val txtPause = findViewById<TextView>(R.id.txtPause)

        // Localizando as imagens no XML
        val imgWater = findViewById<ImageView>(R.id.imgWater)
        val imgHelp = findViewById<ImageView>(R.id.imgHelp)
        val imgHappy = findViewById<ImageView>(R.id.imgHappy)
        val imgPause = findViewById<ImageView>(R.id.imgPause)

        // Conectando os cartões aos dados do Repository
        configureCard(
            button = btnWater,
            textView = txtWater,
            imageView = imgWater,
            card = cards.first { it.id == 1 }
        )

        configureCard(
            button = btnHelp,
            textView = txtHelp,
            imageView = imgHelp,
            card = cards.first { it.id == 2 }
        )

        configureCard(
            button = btnHappy,
            textView = txtHappy,
            imageView = imgHappy,
            card = cards.first { it.id == 3 }
        )

        configureCard(
            button = btnPause,
            textView = txtPause,
            imageView = imgPause,
            card = cards.first { it.id == 4 }
        )
    }

    private fun configureCard(
        button: LinearLayout,
        textView: TextView,
        imageView: ImageView,
        card: CommunicationCard
    ) {

        // Preenchendo o cartão com os dados do Repository
        textView.text = card.title
        imageView.setImageResource(card.imageResId)
        button.contentDescription = card.title

        // Ação executada quando o cartão é tocado
        button.setOnClickListener {

            if (card.messages.isEmpty()) {
                return@setOnClickListener
            }

            // Posição da mensagem atual
            val currentIndex = messageIndexes[card.id] ?: 0

            // Mensagem selecionada
            val message = card.messages[currentIndex]

            // Número da mensagem, começando em 1
            val messageNumber = currentIndex + 1

            // Quantidade total de mensagens do cartão
            val totalMessages = card.messages.size

            // Exibindo o Snackbar personalizado
            showCustomSnackbar(
                view = button,
                message = message,
                messageNumber = messageNumber,
                totalMessages = totalMessages
            )

            // Preparando a próxima mensagem
            messageIndexes[card.id] =
                (currentIndex + 1) % totalMessages
        }
    }

    private fun showCustomSnackbar(
        view: View,
        message: String,
        messageNumber: Int,
        totalMessages: Int
    ) {

        // Cria o Snackbar
        val snackbar = Snackbar.make(
            view,
            "",
            Snackbar.LENGTH_LONG
        )

        // Define a duração em milissegundos
        snackbar.duration = 4000

        // Obtém o layout original do Snackbar
        val snackbarLayout = snackbar.view as Snackbar.SnackbarLayout

        // Remove o fundo padrão
        snackbarLayout.setBackgroundColor(
            android.graphics.Color.TRANSPARENT
        )

        // Adiciona espaçamento interno
        snackbarLayout.setPadding(0, 0, 0, 0)

        // Oculta o texto padrão do Snackbar
        val defaultContent =
            snackbarLayout.getChildAt(0)

        defaultContent.visibility = View.GONE

        // Carrega o layout personalizado
        val customView = LayoutInflater.from(this)
            .inflate(
                R.layout.layout_snackbar,
                snackbarLayout,
                false
            )

        // Localiza os componentes personalizados
        val txtMessage =
            customView.findViewById<TextView>(
                R.id.txtSnackbarMessage
            )

        val txtCounter =
            customView.findViewById<TextView>(
                R.id.txtMessageCounter
            )

        val progress =
            customView.findViewById<ProgressBar>(
                R.id.messageProgress
            )

        // Preenche a mensagem
        txtMessage.text = message

        // Preenche o contador: 01 / 10, 02 / 10...
        txtCounter.text = String.format(
            java.util.Locale.getDefault(),
            "%02d / %02d",
            messageNumber,
            totalMessages
        )

        // Atualiza a barra de progresso
        progress.max = totalMessages
        progress.progress = messageNumber

        // Adiciona o layout personalizado ao Snackbar
        snackbarLayout.addView(customView)

        // Exibe o Snackbar
        snackbar.show()
    }
}