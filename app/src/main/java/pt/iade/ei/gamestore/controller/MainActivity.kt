package pt.iade.ei.gamestore.controller
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem

class MainActivity : ComponentActivity() {

    // 2 jogos, cada um com 3 itens únicos
    private val games = listOf(
        Game(
            id = 1,
            name = "Medieval Quest",
            image = "drawable/medieval_quest",
            items = listOf(
                GameItem(
                    1,
                    1,
                    "Expansão Castelos",
                    19.99,
                    "Construa fortalezas épicas.",
                    "drawable/item1"
                ),
                GameItem(
                    2,
                    1,
                    "DLC Cavaleiros",
                    14.99,
                    "Adicione guerreiros lendários.",
                    "drawable/item2"
                ),
                GameItem(
                    3,
                    1,
                    "Pacote Magia",
                    24.99,
                    "Desbloqueie feitiços poderosos.",
                    "drawable/item3"
                )
            ),
            imageUrl = TODO()
        ),
        Game(
            id = 2,
            name = "Space Odyssey", ,
            items = listOf(
                GameItem(
                    4,
                    2,
                    "Expansão Galáxias",
                    29.99,
                    "Explore mundos alienígenas.",
                    "drawable/item4"
                ),
                GameItem(
                    5,
                    2,
                    "DLC Naves",
                    17.99,
                    "Personalize a sua frota espacial.",
                    "drawable/item5"
                ),
                GameItem(
                    6,
                    2,
                    "Modo Multijogador",
                    12.99,
                    "Jogue com amigos no espaço.",
                    "drawable/item6"
                )
            ),
            imageUrl = TODO(),
            image = TODO(),
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val gameStoreApp = GameStoreApp(games) { selectedGame ->
                val intent = Intent(this, GameDetailActivity::class.java).apply {
                    putExtra("SELECTED_GAME", selectedGame)
                }
                startActivity(intent)
            }
        }
    }
}





