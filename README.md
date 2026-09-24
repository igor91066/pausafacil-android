
# PausaFácil 💬

**Sua comunicação, do seu jeito.**

O **PausaFácil** é um aplicativo Android de comunicação visual, desenvolvido em **Kotlin e XML**, com o objetivo de facilitar a expressão de necessidades, sentimentos e ações por meio de cartões interativos.

O aplicativo apresenta uma interface simples, com ícones, cores e mensagens de fácil identificação. Ao selecionar um cartão, o usuário visualiza uma frase em um **Snackbar personalizado**, que também indica a posição da mensagem na sequência disponível.

## 📱 Funcionalidades

- **Comunicação por cartões:** seleção de mensagens relacionadas a necessidades, sentimentos e ações.
- **Mensagens variadas:** cada cartão possui uma lista de frases que são exibidas sequencialmente a cada toque.
- **Snackbar personalizado:** apresentação da frase selecionada em um componente visual com contador e barra de progresso.
- **Interface visual:** cartões coloridos com ícones e textos para facilitar a identificação das opções.
- **Tela única:** todas as funcionalidades estão disponíveis na tela principal do aplicativo.

### Cartões disponíveis

| Cartão | Finalidade |
|---|---|
| 💧 Quero água | Expressar sede e solicitar água. |
| 🤝 Preciso de ajuda | Solicitar auxílio em diferentes situações. |
| 😊 Estou feliz | Comunicar sentimentos positivos. |
| ☕ Quero uma pausa | Expressar a necessidade de descansar ou interromper uma atividade. |

Cada cartão possui **10 mensagens**. Ao chegar à última frase, o próximo toque retorna à primeira.

## 🛠️ Tecnologias utilizadas

- **Kotlin:** implementação da lógica e das interações do aplicativo.
- **XML:** construção dos layouts e dos componentes visuais.
- **Android Studio:** ambiente de desenvolvimento.
- **Material Components:** utilização do Snackbar para apresentar as mensagens.

## 🗂️ Organização do projeto

O aplicativo separa os dados dos cartões da lógica da tela principal:

```text
app/src/main/
├── java/com/example/pausafacil/
│   ├── MainActivity.kt
│   └── data/
│       ├── model/
│       │   └── CommunicationCard.kt
│       └── repository/
│           └── CommunicationCardRepository.kt
└── res/
    ├── drawable/
    ├── layout/
    │   ├── activity_main.xml
    │   └── layout_snackbar.xml
    └── mipmap-*/
```

- `CommunicationCard.kt`: define os dados de cada cartão.
- `CommunicationCardRepository.kt`: reúne os cartões e suas respectivas listas de mensagens.
- `MainActivity.kt`: configura os cartões, controla a sequência das frases e exibe o Snackbar.
- `activity_main.xml`: define a interface principal.
- `layout_snackbar.xml`: define a aparência do Snackbar personalizado.

## ▶️ Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/igor91066/pausafacil-android.git
   ```

2. Abra o projeto no **Android Studio**.
3. Aguarde a sincronização do Gradle.
4. Conecte um dispositivo Android com a depuração USB ativada ou inicie um emulador.
5. Clique em **Run** para compilar e executar o aplicativo.

## 🎓 Sobre o projeto

O **PausaFácil** foi desenvolvido como um miniprojeto acadêmico da disciplina de **Programação de Dispositivos Móveis (PDM)**, do **Instituto Federal da Paraíba (IFPB) — Campus Monteiro**.

O projeto explora conceitos introdutórios de desenvolvimento Android utilizando Kotlin e XML, incluindo a criação de interfaces, o tratamento de eventos de toque, o uso de listas e a organização dos dados em classes.

### 🏫 Instituição

**Instituto Federal da Paraíba (IFPB) — Campus Monteiro**

### 👨‍💻 Alunos

- Pedro Vitor Barbosa Florentino
- Igor Costa Alcantara de Macedo

---

**PausaFácil — Sua comunicação, do seu jeito.**
