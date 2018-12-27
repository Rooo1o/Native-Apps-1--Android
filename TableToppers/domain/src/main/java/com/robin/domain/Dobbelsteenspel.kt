package com.robin.domain

/**
 * Een dobbelsteenspel erft over van Gezelschapsspel
 * @property aantalDobbelstenen duidt aan met hoeveel dobbelstenen het spel verkocht wordt
 *
 */

class Dobbelsteenspel(id: Long,
                      naam: String,
                      omschrijving: String,
                      uitgever: String,
                      jaarVanUitkomst: Int,
                      speelduurRangeInMinuten: IntArray,
                      aantalSpelersRange: IntArray,
                      gebruikersScores: MutableList<Beoordeling>,
                      hoofdfoto: String,
                      aantalDobbelstenen: Int):
    Gezelschapsspel(id, naam, omschrijving, uitgever, jaarVanUitkomst, speelduurRangeInMinuten, aantalSpelersRange, gebruikersScores, hoofdfoto) {

}