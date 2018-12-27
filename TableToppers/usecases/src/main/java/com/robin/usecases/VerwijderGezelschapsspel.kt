package com.robin.usecases

import com.robin.data.GezelschapsspelRepository
import com.robin.domain.Gezelschapsspel

class VerwijderGezelschapsspel(private val gezelschapsspelRepository: GezelschapsspelRepository){
    operator fun invoke(gezelschapsspel: Gezelschapsspel){
        gezelschapsspelRepository.verwijderGezelschapsspel(gezelschapsspel)
    }

    operator fun invoke(id: Long){
        gezelschapsspelRepository.verwijderGezelschapsspel(id)
    }
}