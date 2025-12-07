package pt.iade.ei.gamestore.view.screen


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.Item
import pt.iade.ei.gamestore.view.components.GameCard

@Composable
fun MainScreen(
    games: List<Game>,
    onGameClick: (Game) -> Unit
) {
    Scaffold(
        topBar = { MainTopBar() },
        bottomBar = { MainBottomBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(games) { game ->
                GameCard(
                    game = game,
                    onClick = { onGameClick(game) }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar() {
    TopAppBar(
        title = { Text(text = "GameStore") }
    )
}

@Composable
fun MainBottomBar() {
    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = { Icon(Icons.Filled.Star, contentDescription = null) },
            label = { Text("Destaque") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Filled.Person, contentDescription = null) },
            label = { Text("Perfil") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    val mockGames = listOf(
        Game(
            id = "1",
            title = "Legends of Ember",
            shortDescription = "RPG de aventura",
            longDescription = "Explore mundos mágicos e lute contra criaturas.",
            imageResName = "ic_launcher_foreground",
            items = emptyList<Item>(),
            imageRes = 0,
            description = "Um RPG cheio de aventura",
            name = "Legends of Ember"
        ),
        Game(
            id = "2",
            title = "Frozen Bastion",
            shortDescription = "Defende o reino gelado",
            longDescription = "Protege o reino contra invasores.",
            imageResName = "ic_launcher_foreground",
            items = emptyList<Item>(),
            imageRes = 0,
            description = "Defende o reino gelado",
            name = "Frozen Bastion"
        )
    )

    MainScreen(
        games = mockGames,
        onGameClick = { }
    )
}