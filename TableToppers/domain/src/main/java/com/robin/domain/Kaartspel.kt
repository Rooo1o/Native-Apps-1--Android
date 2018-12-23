package com.robin.domain

/**
 * Een kaartspel erft over van Gezelschapsspel
 *
 * @property aantalKaarten duidt aan hoeveel kaarten er in het spel zitten.
 *
 */


class Kaartspel(id: Long,
               naam: String,
               omschrijving: String,
               uitgever: String,
               jaarVanUitkomst: Int,
               speelduurRangeInMinuten: IntArray,
               aantalSpelersRange: IntArray,
               redactieScore: Double,
               gebruikersScores: DoubleArray,
               hoofdfoto: String,
               aantalKaarten: Int):
    Gezelschapsspel(id, naam, omschrijving, uitgever, jaarVanUitkomst, speelduurRangeInMinuten, aantalSpelersRange, redactieScore, gebruikersScores, hoofdfoto) {

}

