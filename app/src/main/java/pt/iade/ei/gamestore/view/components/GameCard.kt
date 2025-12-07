package pt.iade.ei.gamestore.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pt.iade.ei.gamestore.model.Game

@Composable
fun GameCard(game: Game, onClick: () -> Unit) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Row(modifier = Modifier.padding(16.dp)) {

            Image(
                painter = painterResource(
                    id = game.imageRes // ← usa o int do drawable (ver nota abaixo)
                ),
                contentDescription = game.name,
                modifier = Modifier.size(64.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = game.name,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = "${game.items.size} itens disponíveis",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}




