package pt.iade.ei.gamestore.view.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import pt.iade.ei.gamestore.ui.theme.GameStoreTheme

class GameDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val gameId = intent.getIntExtra("gameId", -1)

        setContent {
            GameStoreTheme {
                GameDetailScreen(gameId = gameId)
            }
        }
    }
}

@Composable
fun GameDetailScreen(gameId: Int) {

    Text(text = "Detalhes do jogo com ID: $gameId")
}
