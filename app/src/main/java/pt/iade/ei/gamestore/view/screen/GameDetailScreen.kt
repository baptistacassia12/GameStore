package pt.iade.ei.gamestore.view.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem
import pt.iade.ei.gamestore.ui.theme.GameStoreTheme

class GameDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gameId = intent.getStringExtra("gameId") ?: ""

        setContent {
            GameStoreTheme {
                GameDetailScreen(gameId = gameId,)
            }
        }
    }
}

@Composable
fun GameDetailScreen(
    gameId: String,
    onPurchase: (GameItem) -> Unit,
    game: Game,
    onBackClick: () -> Unit
) {

    Text(text = "Detalhes do jogo com ID: $gameId")
}
