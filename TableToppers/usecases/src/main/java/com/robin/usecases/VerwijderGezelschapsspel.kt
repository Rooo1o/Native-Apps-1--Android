package com.robin.usecases

import com.robin.data.TabletoppersRepository
import com.robin.domain.Gezelschapsspel

class VerwijderGezelschapsspel(private val tabletoppersRepository: TabletoppersRepository){
    operator fun invoke(gezelschapsspel: Gezelschapsspel){
        tabletoppersRepository.verwijderGezelschapsspel(gezelschapsspel)
    }

    operator fun invoke(id: Long){
        tabletoppersRepository.verwijderGezelschapsspel(id)
    }
}