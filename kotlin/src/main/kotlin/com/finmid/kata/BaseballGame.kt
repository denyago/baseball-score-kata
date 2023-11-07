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
    //                  Base:   1  2  3  4 Score!
    private val bases = mutableListOf(1, 0, 0, 0, 0)

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
                bases[4] += bases[3]
                bases[3] = bases[2]
                bases[2] = bases[1]
                bases[1] = bases[0]
                score = bases[4] to 0
            }
            Play.DOUBLE -> {
                bases[4] += bases[3]
                bases[4] += bases[2]
                bases[3] = bases[1]
                bases[2] = bases[0]
                score = bases[4] to 0
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
