package com.robin.domain

/**
 * Een bordspel erft over van Gezelschapsspel
 *
 *
 * @constructor Stelt alle properties in
 * @property id Het id van het spel (gedeeld met alle subklassen van Gezelschapsspel)
 * @property naam de naam van het bordspel. Bij Uno is dit Uno.
 * @property omschrijving Een omschrijving, korte uitleg van het spel
 * @property uitgever De naam van de uitgever van het spel
 * @property jaarVanUitkomst Het jaar waarin het spel uitgekomen is
 * @property speelduurRangeInMinuten Een IntArray die aanduidt hoelang het spel ongeveer duurt. Bij Uno is dit ongeveer 15 minuten, bij Monopoly 2 - 4 uur.
 * @property aantalSpelersRange hoeveel spelers er kunnen meedoen. Bij Monopoly bijvoorbeeld is dit een IntArray van 2-5.
 * @property redactieScore is de score die de redactie het spel geeft van 0 tot 10.
 * @property gebruikersScores zijn alle scores die gebruikes ooit al hebben ingegeven. Hiervan wordt het gemiddelde berekend.
 *
 */


abstract class Gezelschapsspel(val id: Long,
                               val naam: String,
                               var omschrijving: String,
                               val uitgever: String,
                               val jaarVanUitkomst: Int,
                               val speelduurRangeInMinuten: IntArray,
                               val aantalSpelersRange: IntArray,
                               var redactieScore: Double,
                               var gebruikersScores: DoubleArray,
                               val hoofdfoto: String){}
