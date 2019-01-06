package com.robin.usecases

import com.robin.data.TabletoppersRepository
import com.robin.domain.Gebruiker
import javax.inject.Inject


class Login(){
    @Inject
    lateinit var tabletoppersRepository: TabletoppersRepository
    operator fun invoke(gebruikersnaamOfEmailadres: String, wachtwoord: String): Gebruiker?{
        return tabletoppersRepository.login(gebruikersnaamOfEmailadres, wachtwoord)
    }
}