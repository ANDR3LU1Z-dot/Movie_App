package com.example.movieapp.data

import androidx.room.Embedded
import androidx.room.Relation
import com.example.movieapp.MoviePostersResponse

data class MoviePostersWithAllProperties (
    @Embedded var moviePostersResponse: MoviePostersResponse,
    @Relation(
        entity = Posters::class,
        parentColumn = "id",
        entityColumn = "moviePosterId"
    ) var posters: List<Posters>
)