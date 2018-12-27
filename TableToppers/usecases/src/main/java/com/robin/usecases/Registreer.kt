package com.robin.usecases

import com.robin.data.GebruikersRepository

class Registreer(private val gebruikersRepository: GebruikersRepository){
    operator fun invoke(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean{
        return gebruikersRepository.registreer(id, gebruikersnaam, emailadres, wachtwoord)
    }
}