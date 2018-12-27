package com.robin.usecases

import com.robin.data.GebruikersRepository
import com.robin.data.GezelschapsspelRepository
import com.robin.domain.Gebruiker

class Login(private val gebruikersRepository: GebruikersRepository){
    operator fun invoke(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker?{
        return gebruikersRepository.login(gebruikersnaamOfEmailadres, wachtwoord)
    }
}