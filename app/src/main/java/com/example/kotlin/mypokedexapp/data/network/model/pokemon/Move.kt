package com.example.kotlin.mypokedexapp.data.network.model.pokemon

data class Move(
    val move:MoveX,
    val version_group_details: List<VersionGroupDetail>
)