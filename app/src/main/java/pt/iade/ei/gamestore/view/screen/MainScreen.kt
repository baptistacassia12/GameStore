package pt.iade.ei.gamestore.view.screen

import androidx.compose.material.icons.filled.History
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import pt.iade.ei.gamestore.model.Game



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    games: List<Game>,
    onGameClick: (Game) -> Unit
) {
    Scaffold(
        topBar = { MainTopBar() },
        bottomBar = { MainBottomBar() }
    ) { innerPadding ->

        // Fundo amarelo em toda a tela
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFF4A8)) // amarelo suave
                .padding(innerPadding)

        ) {
            Text(
            text = "App carregada com sucesso!",
            modifier = Modifier.padding(16.dp),
            color = Color.Black
        )


            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
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
}

@Composable
fun GameCard(game: Game, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            text = game.name,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "GameStore",
                fontWeight = FontWeight.Bold
            )
        },
        modifier = Modifier
            .background(Color(0xFFFFF4A8))
    )
}

@Composable
fun MainBottomBar() {
    NavigationBar(
        containerColor = Color(0xFFFFF4A8)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Destaque"
                )
            },
            label = { Text("Destaque") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Filled.History,
                    contentDescription = "Histórico"
                )
            },
            label = { Text("Histórico") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Perfil"
                )
            },
            label = { Text("Perfil") }
        )
    }
}