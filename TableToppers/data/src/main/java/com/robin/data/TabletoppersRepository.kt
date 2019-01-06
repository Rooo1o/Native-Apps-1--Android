package com.robin.data

import com.robin.domain.Beoordeling
import com.robin.domain.Gebruiker
import com.robin.domain.Gezelschapsspel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TabletoppersRepository {
    @Inject
    private lateinit var gezelschapsspelPersistenceSource: GezelschapsspelPersistenceSource
    @Inject
    private lateinit var gebruikersPersistenceSource: GebruikersPersistenceSource

    fun getAlleGebruikers(): List<Gebruiker>? = gebruikersPersistenceSource.getAlleGebruikers()
    fun getGezelschapsspelen(): List<Gezelschapsspel> = gezelschapsspelPersistenceSource.getGezelschapsspelen()
    fun getGezelschapsspel(id: Long): Gezelschapsspel? = gezelschapsspelPersistenceSource.getGezelschapsspel(id)


    fun login(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker? {
        return gebruikersPersistenceSource.login(gebruikersnaamOfEmailadres, wachtwoord)
    }

    fun registreer(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean {
        return gebruikersPersistenceSource.registreer(id, gebruikersnaam, emailadres, wachtwoord)
    }

    fun beoordeelGezelschapsspel(spelId: Long, beoordeling: Beoordeling) {
        gezelschapsspelPersistenceSource.getGezelschapsspel(spelId)?.voegBeoordelingToe(beoordeling)
    }

    fun verwijderGezelschapsspel(gezelschapsspel: Gezelschapsspel) {
        gezelschapsspelPersistenceSource.verwijderGezelschapsspel(gezelschapsspel)
    }

    fun verwijderGezelschapsspel(id: Long) {
        gezelschapsspelPersistenceSource.verwijderGezelschapsspel(id)
    }
}

interface GebruikersPersistenceSource {
    fun getAlleGebruikers(): List<Gebruiker>?
    fun login(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker?
    fun registreer(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean
}

interface GezelschapsspelPersistenceSource {
    fun getGezelschapsspelen(): List<Gezelschapsspel>
    fun getGezelschapsspel(id: Long): Gezelschapsspel?
    fun voegGezelschapsspelToe(gezelschapsspel: Gezelschapsspel)
    fun verwijderGezelschapsspel(gezelschapsspel: Gezelschapsspel)
    fun verwijderGezelschapsspel(id: Long)
}

