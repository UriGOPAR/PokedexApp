package com.example.kotlin.mypokedexapp.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    @SerializedName("icons") val icons: Icons,
    @SerializedName("ultra-sun-ultra-moon") val ultraMoon: UltraSunUltraMoon
)