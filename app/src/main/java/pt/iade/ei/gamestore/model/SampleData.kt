package pt.iade.ei.gamestore.model

object SampleData {
    val games = listOf(
        Game(
            id = "g1",
            title = "SkyQuest",
            shortDescription = "RPG épico nas nuvens",
            longDescription = "Um RPG com batalhas aéreas e expedições...",
            imageResName = "game_skyquest",
            items = listOf(
                Item("i1", "Sword of Wind", "Espada lendária", 4.99, "item_sword"),
                Item("i2", "Cloud Armor", "Armadura leve", 2.99, "item_armor"),
                Item("i3", "Feather Pack", "Pacote de recursos", 1.99, "item_pack")
            ),
            imageRes = TODO(),
            description = TODO(),
            name = TODO(),
        ),
        Game(
            id = "g2",
            title = "DungeonFall",
            shortDescription = "Aventure-se nas profundezas",
            longDescription = "Roguelike com níveis gerados proceduralmente...",
            imageResName = "game_dungeonfall",
            items = listOf(
                Item("i4", "Fire Wand", "Varinha elemental", 3.99, "item_wand"),
                Item("i5", "Health Potion", "Cura instantânea", 0.99, "item_potion"),
                Item("i6", "Treasure Map", "Mapa raro", 2.49, "item_map")
            ),
            imageRes = TODO(),
            description = TODO(),
            name = TODO(),
        )
    )
}