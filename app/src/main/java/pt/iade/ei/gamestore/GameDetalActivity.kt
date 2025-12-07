package pt.iade.ei.gamestore

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem
import pt.iade.ei.gamestore.ui.theme.GameStoreTheme
import pt.iade.ei.gamestore.view.screen.GameDetailScreen



// Activity que mostra os detalhes de um jogo e os itens compráveis.
class GameDetailActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Corrigido: nome do extra deve ser string literal
        val game = intent.getSerializableExtra("game") as? Game

        setContent {
            GameStoreTheme {

                // Estado para controlar o item selecionado
                var selectedItem by remember { mutableStateOf<GameItem?>(null) }

                // Só mostra a UI se o jogo foi recebido corretamente
                if (game != null) {
                    GameDetailScreen(
                        game = game,
                        onItemClick = { item ->
                            selectedItem = item
                        },
                        selectedItem = selectedItem,
                        onBuyClick = { item ->
                            // Mostra Toast com nome e preço do item comprado
                            Toast.makeText(
                                this,
                                "Acabou de comprar o item ${item.name} por $${item.price}",
                                Toast.LENGTH_LONG
                            ).show()
                            selectedItem = null // Fecha BottomSheet
                        },
                        onDismissBottomSheet = {
                            selectedItem = null
                        },
                        game1 = TODO()
                    )
                }
            }
        }
    }
}