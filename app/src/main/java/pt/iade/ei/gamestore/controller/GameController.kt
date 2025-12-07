package pt.iade.ei.gamestore.controller

import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.Item

object GameController {

    fun getGamesList(): List<Game> {

        val items = listOf(
            Item(
                id = "1",
                name = "Espada Flamejante",
                description = "Uma espada lendária com poder de fogo.",
                price = 9.99,
                imageResName = "item_sword"
            ),
            Item(
                id = "2",
                name = "Escudo de Gelo",
                description = "Proteção mágica contra ataques.",
                price = 7.49,
                imageResName = "item_shield"
            )
        )

        return listOf(
            Game(
                id = "1",
                title = "Legends of Ember",
                shortDescription = "RPG de aventura",
                longDescription = "Explore mundos mágicos e lute contra criaturas.",
                imageResName = "game_ember",
                items = items,
                imageRes = 0,
                 "Um RPG cheio de aventura",
                name = "Legends of Ember"
            ),
            Game(
                id = "2",
                title = "Frozen Bastion",
                shortDescription = "Defende o reino gelado",
                longDescription = "Protege o reino contra invasores.",
                imageResName = "game_frozen",
                items = items,
                imageRes = 0,
                description = "Defende o reino gelado",
                name = "Frozen Bastion"
            )
        )
    }
}




