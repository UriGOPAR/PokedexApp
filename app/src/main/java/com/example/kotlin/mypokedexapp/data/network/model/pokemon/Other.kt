package com.example.kotlin.mypokedexapp.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream-world") val dream_world: DreamWorld,
    @SerializedName("home") val home: Home,
    @SerializedName("official-artwork") val official_artwork:OfficialArtwork

)