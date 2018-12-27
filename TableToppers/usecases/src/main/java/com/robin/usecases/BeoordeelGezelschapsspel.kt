package com.robin.usecases

import com.robin.data.GezelschapsspelRepository
import com.robin.domain.Beoordeling

class BeoordeelGezelschapsspel(private val gezelschapsspelRepository: GezelschapsspelRepository){
     operator fun invoke(spelId: Long, userId: Long, score: Double){
         val beoordeling = Beoordeling(userId, score)
         gezelschapsspelRepository.beoordeelGezelschapsspel(spelId, beoordeling)
     }
}