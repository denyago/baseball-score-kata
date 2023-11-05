package com.finmid.kata

enum class Play {
    OUT,
    STRIKE,
    BALL,
    HOMERUN,
    SINGLE,
    DOUBLE,
    TRIPLE,
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
