package pt.iade.ei.gamestore.model

import kotlinx.serialization.Serializer
import java.io.Serializable

data class GameItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageRes: Int
) : Serializable