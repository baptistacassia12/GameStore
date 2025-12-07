package pt.iade.ei.gamestore.controller

import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem


object GameController {

    fun getSampGames(mysticHollow: Game): List<Game> {
        val mysticHollwItems = listOf(
            GameItem(7,"Wand of Whispers", "Varinha mágica.",10.49,0),
            GameItem(8,"Cloak of Shadows", "Capa de invisibilidade.",13.99,0),
            GameItem(9,"Elixir of Echoes", "Poção especial.", 8.99,0)
        )
        val mechaArenaItems = listOf(
            GameItem(10, "Plasma Cannon", "Canhão de plasma.", 15.99, 0),
            GameItem(11, "Titan Core", "Núcleo avançado.", 17.49, 0),
            GameItem(12, "Nano Shield", "Escudo inteligente.", 12.29, 0)
        )
        val mechaArenaX = Game(
                2, "Mecha Arena X",
        "Combates futuristas com mechas personalizáveis.",
        0, mechaArenaItems
        )

        return listOf(mysticHollow, mechaArenaX)

        }
     }