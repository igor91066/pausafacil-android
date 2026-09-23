
package com.example.pausafacil.data.repository

import android.R
import com.example.pausafacil.data.model.CommunicationCard

class CommunicationCardRepository {

    fun getCards(): List<CommunicationCard> {

        return listOf(
            CommunicationCard(
                id = 1,
                title = "Quero água",
                imageResId = R.drawable.ic_menu_gallery,
                category = "Necessidades"
            ),

            CommunicationCard(
                id = 2,
                title = "Preciso de ajuda",
                imageResId = R.drawable.ic_menu_help,
                category = "Necessidades"
            ),

            CommunicationCard(
                id = 3,
                title = "Estou feliz",
                imageResId = R.drawable.btn_star_big_on,
                category = "Sentimentos"
            ),

            CommunicationCard(
                id = 4,
                title = "Quero uma pausa",
                imageResId = R.drawable.ic_lock_idle_alarm,
                category = "Ações"
            )
        )
    }
}