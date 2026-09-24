package com.example.pausafacil.data.repository

import com.example.pausafacil.R
import com.example.pausafacil.data.model.CommunicationCard

class CommunicationCardRepository {

    fun getCards(): List<CommunicationCard> {

        return listOf(
            CommunicationCard(
                id = 1,
                title = "Quero água",
                imageResId = R.drawable.glass_water,
                category = "Necessidades",
                messages = listOf(
                    "Quero água",
                    "Estou com sede",
                    "Pode me trazer um copo de água?",
                    "Gostaria de beber água",
                    "Preciso de um pouco de água",
                    "Pode encher meu copo, por favor?",
                    "Quero mais água",
                    "Minha água acabou",
                    "Pode deixar a água perto de mim?",
                    "Obrigado por me trazer água"
                )
            ),

            CommunicationCard(
                id = 2,
                title = "Preciso de ajuda",
                imageResId = R.drawable.hand_helping,
                category = "Necessidades",
                messages = listOf(
                    "Preciso de ajuda",
                    "Pode me ajudar, por favor?",
                    "Não estou conseguindo fazer isso",
                    "Não entendi o que devo fazer",
                    "Pode me explicar novamente?",
                    "Preciso que alguém fique comigo",
                    "Pode me mostrar como fazer?",
                    "Estou com dificuldade",
                    "Preciso de ajuda agora",
                    "Obrigado por me ajudar"
                )
            ),

            CommunicationCard(
                id = 3,
                title = "Estou feliz",
                imageResId = R.drawable.face_slightly_smiling,
                category = "Sentimentos",
                messages = listOf(
                    "Estou feliz",
                    "Estou me sentindo bem",
                    "Gostei muito disso!",
                    "Estou animado",
                    "Isso me deixou contente",
                    "Estou me divertindo",
                    "Quero fazer isso novamente",
                    "Estou orgulhoso de mim",
                    "Hoje estou de bom humor",
                    "Obrigado por esse momento"
                )
            ),

            CommunicationCard(
                id = 4,
                title = "Quero uma pausa",
                imageResId = R.drawable.coffee,
                category = "Ações",
                messages = listOf(
                    "Quero uma pausa",
                    "Preciso descansar um pouco",
                    "Podemos continuar depois?",
                    "Estou cansado",
                    "Quero ficar em silêncio por um momento",
                    "Preciso de um lugar tranquilo",
                    "Quero parar um pouco",
                    "Preciso de alguns minutos",
                    "Ainda não estou pronto para continuar",
                    "Já descansei e quero continuar"
                )
            )
        )
    }
}