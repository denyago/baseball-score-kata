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
    private var score: Pair<Int, Int> = 0 to 0

    fun play(event: Play) {
        when (event) {
            Play.HOMERUN -> {
                score = 1 to 0
            }
            Play.OUT -> {
                score = 0 to 0
            }
            Play.STRIKE -> {
                score = 0 to 0
            }
            Play.BALL -> {
                score = 0 to 0
            }
            Play.SINGLE -> {
                score = 0 to 0
            }
            Play.DOUBLE -> {
                score = 0 to 0
            }
            Play.TRIPLE -> {
                score = 0 to 0
            }

            else -> TODO()
        }
    }

    fun score(): Pair<Int, Int> {
        return score
    }
}
