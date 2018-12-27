package com.robin.data

import com.robin.domain.Gebruiker

class GebruikersRepository(private val gebruikersPersistenceSource: GebruikersPersistenceSource){
    fun getAlleGebruikers(): List<Gebruiker>? = gebruikersPersistenceSource.getAlleGebruikers()

    fun login(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker?{
        return gebruikersPersistenceSource.login(gebruikersnaamOfEmailadres, wachtwoord)
    }

    fun registreer(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean{
        return gebruikersPersistenceSource.registreer(id, gebruikersnaam, emailadres, wachtwoord)
    }
}

interface GebruikersPersistenceSource {
    fun getAlleGebruikers(): List<Gebruiker>?
    fun login(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker?
    fun registreer(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean
}