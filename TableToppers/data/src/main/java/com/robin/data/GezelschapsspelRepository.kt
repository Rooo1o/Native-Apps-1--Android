package com.robin.data

import com.robin.domain.Gezelschapsspel

class GezelschapsspelRepository(private val gezelschapsspelPersistenceSource: GezelschapsspelPersistenceSource){
    fun getGezelschapsspelen(): List<Gezelschapsspel> = gezelschapsspelPersistenceSource.getGezelschapsspelen()
}

interface GezelschapsspelPersistenceSource {
    fun getGezelschapsspelen(): List<Gezelschapsspel>
}
