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
               redactieScore: Double,
               hoofdfoto: String,
               gebruikersScores: DoubleArray):
    Gezelschapsspel(id, naam, omschrijving, uitgever, jaarVanUitkomst, speelduurRangeInMinuten, aantalSpelersRange, redactieScore,  gebruikersScores, hoofdfoto){}