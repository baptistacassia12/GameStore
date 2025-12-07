package pt.iade.ei.gamestore.model


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameItem(
    val id: Int,
    val gameId: Int, // Associa ao jogo
    val name: String,
    val price: Double,
    val description: String,
    val imageUrl: String // Usado para drawable resource
) : Parcelable