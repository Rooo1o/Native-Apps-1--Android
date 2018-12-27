package com.robin.domain

/**
 * Een bordspel erft over van Gezelschapsspel
 *
 */

class Bordspel(id: Long,
               naam: String,
               omschrijving: String,
               uitgever: String,
               jaarVanUitkomst: Int,
               speelduurRangeInMinuten: IntArray,
               aantalSpelersRange: IntArray,
               gebruikersScores: MutableList<Beoordeling>,
               hoofdfoto: String
               ):
    Gezelschapsspel(id, naam, omschrijving, uitgever, jaarVanUitkomst, speelduurRangeInMinuten, aantalSpelersRange, gebruikersScores, hoofdfoto){}