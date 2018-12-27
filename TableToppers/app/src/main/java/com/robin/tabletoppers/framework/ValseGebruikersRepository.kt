package com.robin.tabletoppers.framework

import com.robin.data.GebruikersPersistenceSource
import com.robin.domain.Gebruiker


class ValseGebruikersRepository : GebruikersPersistenceSource {
    val gebruikersLijst = mutableListOf<Gebruiker>()

    init {
        vulRepositoryOpMetDummyGebruikers()
    }

    fun vulRepositoryOpMetDummyGebruikers(){
        registreer(0, "robin", "robinroos1@hotmail.com", "Wachtwoord1")
        registreer(1, "robbe", "robbedevos1996@gmaiL.com", "foxyboii2")
        registreer(2, "simon", "simonpann@hotmail.com", "30staalplaten")
        registreer(3, "joren", "creepie.men@gmail.com", "darknesscreep69")
    }

    override fun getAlleGebruikers(): List<Gebruiker>? {
         return gebruikersLijst.toList()
    }

    override fun registreer(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean {
        return gebruikersLijst.add(Gebruiker(id, gebruikersnaam, emailadres, wachtwoord))
    }

    override fun login(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker? {
        for(gebruiker in gebruikersLijst){
            if((gebruiker.gebruikersnaam == gebruikersnaamOfEmailadres || gebruiker.emailadres == gebruikersnaamOfEmailadres) && gebruiker.wachtwoord == wachtwoord){
                return gebruiker
            }
        }
        return null
    }





}