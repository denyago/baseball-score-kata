package com.finmid.kata

enum class Play {
    STRIKE,
    BALL,
    OUT,
    SINGLE,
    DOUBLE,
    TRIPLE,
    HOMERUN,
    STEAL,
    SACRIFICE_OUT,
}

class BaseballGame {

    fun play(event: Play) {
        TODO()
    }

    fun score(): Pair<Int, Int> {
        TODO()
    }
}
