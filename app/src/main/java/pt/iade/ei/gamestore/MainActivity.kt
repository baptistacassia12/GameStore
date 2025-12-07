package pt.iade.ei.gamestore


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import pt.iade.ei.gamestore.controller.GameController
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.ui.theme.GameStoreTheme
import pt.iade.ei.gamestore.view.screen.GameDetailActivity
import pt.iade.ei.gamestore.view.screen.MainScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val gamesList: List<Game> = GameController.getGamesList()

        setContent {
            GameStoreTheme {
                val context = LocalContext.current


                MainScreen(
                    games = gamesList,
                    onGameClick = { game: Game ->
                        val intent = Intent(context, GameDetailActivity::class.java)
                        intent.putExtra("gameId", game.id)
                        context.startActivity(intent)
                    }
                )
            }
        }
    }


}



