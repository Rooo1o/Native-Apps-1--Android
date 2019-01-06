package com.robin.usecases

import com.robin.data.TabletoppersRepository
import javax.inject.Inject

class Registreer(){
    @Inject
    lateinit var tabletoppersRepository: TabletoppersRepository
    operator fun invoke(id: Long, gebruikersnaam: String, emailadres: String, wachtwoord: String): Boolean{
        return tabletoppersRepository.registreer(id, gebruikersnaam, emailadres, wachtwoord)
    }
}