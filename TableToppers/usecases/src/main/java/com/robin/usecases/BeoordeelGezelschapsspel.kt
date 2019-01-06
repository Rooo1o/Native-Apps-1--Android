package com.robin.usecases

import com.robin.data.TabletoppersRepository
import com.robin.domain.Beoordeling

class BeoordeelGezelschapsspel(private val tabletoppersRepository: TabletoppersRepository){
     operator fun invoke(spelId: Long, userId: Long, score: Double){
         val beoordeling = Beoordeling(userId, score)
         tabletoppersRepository.beoordeelGezelschapsspel(spelId, beoordeling)
     }
}