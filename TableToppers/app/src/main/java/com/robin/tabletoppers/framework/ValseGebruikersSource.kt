package com.robin.tabletoppers.framework

import com.robin.data.GebruikersPersistenceSource
import com.robin.domain.Gebruiker
import javax.inject.Singleton


@Singleton
class ValseGebruikersSource : GebruikersPersistenceSource {
    val gebruikersLijst = mutableListOf<Gebruiker>()

    init {
        vulSourceOpMetDummyGebruikers()
    }

    private fun vulSourceOpMetDummyGebruikers(){
        registreer(0, "robin", "robinroos1@hotmail.com", "Wachtwoord1")
        registreer(1, "robbe", "robbedevos@live.com", "foxyboii2")
        registreer(2, "simon", "simon.pann@gmail.com", "30staalplaten")
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