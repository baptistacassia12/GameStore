package pt.iade.ei.gamestore.controller


import pt.iade.ei.gamestore.R
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem

object GameController {
    fun getGamesList(): List<Game> {
        // Lista de itens para cada jogo
        val items1 = listOf(
            GameItem(1, "Espada de Fogo", "Uma espada lendária.", 9.99, R.drawable.ic_launcher_foreground),
            GameItem(2, "Escudo de Gelo", "Proteção mágica.", 7.49, R.drawable.ic_launcher_foreground)
        )

        val items2 = listOf(
            GameItem(3, "Arco Fantasma", "Arma à distância etérea.", 11.99, R.drawable.ic_launcher_foreground),
            GameItem(4, "Poção de Vida", "Restaura energia.", 4.99, R.drawable.ic_launcher_foreground)
        )


        val game1 = Game(
            id = 1,
            name = "Legends of Ember",
            description = "Um RPG cheio de aventuras.",
            imageRes = R.drawable.ic_launcher_foreground,
            items = items1
        )

        val game2 = Game(
            id = 2,
            name = "Frozen Bastion",
            description = "Defende o reino gelado.",
            imageRes = R.drawable.ic_launcher_foreground,
            items = items2
        )

        return listOf(game1, game2)
    }
}