package com.example.kotlin.mypokedexapp.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    @SerializedName("emerald") val emerald: Emerald,
    @SerializedName("firered-leafgreen") val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire") val rubySapphire:RubySapphire
)