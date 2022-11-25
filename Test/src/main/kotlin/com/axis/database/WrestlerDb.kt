package com.axis.database

import com.axis.model.Wrestler

class WrestlerDb {
    var wrestler=mutableListOf<Wrestler>()
    init{
        wrestler.add(Wrestler("prathyu",25,5.2f,45.0))
        wrestler.add(Wrestler("usha",24,5.0f,78.0))
        wrestler.add(Wrestler("rahul",25,6.0f,88.0))

    }
    fun wrestler1():MutableList<Wrestler>{
        return wrestler
    }
}