package pt.iade.ei.gamestore.ui.theme

import android.content.Context

/**
 * Resolve um nome de recurso (string) para o id do drawable.
 * Ex: "game_skyquest" -> R.drawable.game_skyquest
 */
fun getDrawableIdByName(context: Context, name: String): Int {
    // retorna 0 se não existir; caller deve tratar esse caso se necessário
    return context.resources.getIdentifier(name, "drawable", context.packageName)
}