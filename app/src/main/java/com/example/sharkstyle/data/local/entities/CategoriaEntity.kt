package com.example.sharkstyle.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Categorias")

data class CategoriaEntity(
    @PrimaryKey
    val categoriaId: Int,
    val nombre: String,
    val imagen: String
)
