package pt.iade.ei.gamestore.view.components
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem
import pt.iade.ei.gamestore.view.screen.GameDetailScreen

class GameDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val game = intent.getParcelableExtra<Game>("SELECTED_GAME") ?: return

        setContent {
            GameDetailApp(
                game = game,

                onBackClick = {
                    finish()
                },

                onPurchase = { purchasedItem ->
                    Toast.makeText(
                        this,
                        "Acabou de comprar o item ${purchasedItem.name} por €${purchasedItem.price}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            )
        }
    }
}

@Composable
fun GameDetailApp(
    game: Game,
    onBackClick: () -> Unit,
    onPurchase: (GameItem) -> Unit
) {
    GameDetailScreen(
        game = game,
        onBackClick = onBackClick,
        onPurchase = onPurchase
    )
}
