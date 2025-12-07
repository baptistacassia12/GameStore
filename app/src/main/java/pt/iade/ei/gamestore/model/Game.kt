package pt.iade.ei.gamestore.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Game(
    val id: Int,
    val name: String,
    val imageUrl: String, // Usado para drawable resource
    val items: List<GameItem>,
    val image: String
) : Parcelable