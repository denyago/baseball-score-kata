package com.finmid.kata

import com.finmid.kata.Play.BALL
import com.finmid.kata.Play.DOUBLE
import com.finmid.kata.Play.HOMERUN
import com.finmid.kata.Play.OUT
import com.finmid.kata.Play.SACRIFICE_OUT
import com.finmid.kata.Play.SINGLE
import com.finmid.kata.Play.STEAL
import com.finmid.kata.Play.STRIKE
import com.finmid.kata.Play.TRIPLE
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class BaseballGameTest {

    @Test
    fun homeRun() {
        val game = BaseballGame()
        game.play(HOMERUN)

        game.score() shouldBe (1 to 0)
    }
}
