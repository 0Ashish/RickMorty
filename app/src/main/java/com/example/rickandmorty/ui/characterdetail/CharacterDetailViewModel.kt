package com.example.rickandmorty.ui.characterdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.model.CharacterDetail
import com.example.rickandmorty.data.repository.CharacterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharacterDetailViewModel (private val repository: CharacterRepository) : ViewModel() {

    private val _characterDetail = MutableStateFlow<CharacterDetail?>(null)
    val characterDetail: StateFlow<CharacterDetail?> = _characterDetail

    fun loadCharacterDetail(id: Int) {
        viewModelScope.launch {
            _characterDetail.value = repository.getCharacterDetail(id)
        }
    }
}