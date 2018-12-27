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
               gebruikersScores: MutableList<Beoordeling>,
               hoofdfoto: String,
               aantalKaarten: Int):
    Gezelschapsspel(id, naam, omschrijving, uitgever, jaarVanUitkomst, speelduurRangeInMinuten, aantalSpelersRange, gebruikersScores, hoofdfoto) {

}

