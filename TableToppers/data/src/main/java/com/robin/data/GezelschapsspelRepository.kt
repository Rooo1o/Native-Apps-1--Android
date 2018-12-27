package com.robin.data

import com.robin.domain.Beoordeling
import com.robin.domain.Gezelschapsspel

class GezelschapsspelRepository(private val gezelschapsspelPersistenceSource: GezelschapsspelPersistenceSource){
    fun getGezelschapsspelen(): List<Gezelschapsspel> = gezelschapsspelPersistenceSource.getGezelschapsspelen()
    fun getGezelschapsspel(id: Long): Gezelschapsspel? = gezelschapsspelPersistenceSource.getGezelschapsspel(id)

    fun beoordeelGezelschapsspel(spelId: Long, beoordeling: Beoordeling){
        gezelschapsspelPersistenceSource.getGezelschapsspel(spelId)?.voegBeoordelingToe(beoordeling)
    }

    fun verwijderGezelschapsspel(gezelschapsspel: Gezelschapsspel){
        gezelschapsspelPersistenceSource.verwijderGezelschapsspel(gezelschapsspel)
    }

    fun verwijderGezelschapsspel(id: Long){
        gezelschapsspelPersistenceSource.verwijderGezelschapsspel(id)
    }
}

interface GezelschapsspelPersistenceSource {
    fun getGezelschapsspelen(): List<Gezelschapsspel>
    fun getGezelschapsspel(id: Long): Gezelschapsspel?
    fun voegGezelschapsspelToe(gezelschapsspel: Gezelschapsspel)
    fun verwijderGezelschapsspel(gezelschapsspel: Gezelschapsspel)
    fun verwijderGezelschapsspel(id: Long)
}
