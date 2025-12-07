package pt.iade.ei.gamestore.model

data class Game(
    val id: Int,
    val name: String,
    val description: String,
    val imageRes: Int,
    val items: List<GameItem>
) : java.io.Serializable