package com.example.rickandmorty.ui.characterlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CharacterListScreen(viewModel: CharacterListViewModel, navController: NavHostController) {
    val characters by viewModel.characters.collectAsState()

    LazyColumn(
        contentPadding = PaddingValues(16.dp),

        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        items(characters.size) { index ->
            CharacterListItem(character = characters[index]) {
                navController.navigate("characterDetail/${characters[index].id}")
            }
        }
    }
}




