package com.robin.tabletoppers.framework

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DATABANK_NAAM = "dbTableToppers"
val TABLE_NAME ="LokaalOpgeslagenGezelschapsspelen"
val COL_ID = "id"
val COL_NAAM = "naam"
val COL_OMSCHRIJVING = "omschrijving"
val COL_UITGEVER = "uitgever"
val COL_JAARVANUITKOMST = "jaar van uitkomst"
val COL_SPEELDUURINMINUTEN = "speelduur in minuten"
val COL_AANTALSPELERSRANGE = "aantal spelers range"
val COL_GEBRUIKERSSCORES = "scores van gebruikers"
val COL_HOOFDFOTO = "hoofdfoto"
val COL_AANTALDOBBELSTENEN = "aantal dobbelstenen"
val COL_AANTALKAARTEN = "aantal kaarten"


class LokaleDatabankSource(context: Context): SQLiteOpenHelper(context, DATABANK_NAAM, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
         val createTable = "CREATE TABLE " + TABLE_NAME + " ("
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}