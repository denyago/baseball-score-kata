package com.finmid.kata

import com.finmid.kata.Play.BALL
import com.finmid.kata.Play.DOUBLE
import com.finmid.kata.Play.HOMERUN
import com.finmid.kata.Play.OUT
import com.finmid.kata.Play.SINGLE
import com.finmid.kata.Play.STRIKE
import com.finmid.kata.Play.TRIPLE
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(ExecutionListener::class)
class BaseballGameTest {

    @Test
    fun homeRun() {
        val game = BaseballGame()
        game.play(HOMERUN)

        game.score() shouldBe (1 to 0)
    }

    @Test
    fun out() {
        val game = BaseballGame()
        game.play(OUT)

        game.score() shouldBe (0 to 0)
    }

    @Test
    fun strike() {
        val game = BaseballGame()
        game.play(STRIKE)

        game.score() shouldBe (0 to 0)
    }

    @Test
    fun ball() {
        val game = BaseballGame()
        game.play(BALL)

        game.score() shouldBe (0 to 0)
    }

    @Test
    fun single() {
        val game = BaseballGame()
        game.play(SINGLE)

        game.score() shouldBe (0 to 0)
    }

    @Test
    fun double() {
        val game = BaseballGame()
        game.play(DOUBLE)

        game.score() shouldBe (0 to 0)
    }

    @Test
    fun doubleDouble() {
        val game = BaseballGame()
        game.play(DOUBLE)
        game.play(DOUBLE)

        game.score() shouldBe (1 to 0)
    }

    @Test
    fun triple() {
        val game = BaseballGame()
        game.play(TRIPLE)

        game.score() shouldBe (0 to 0)
    }

    @Test
    fun fourSingle() {
        val game = BaseballGame()
        repeat(4) { game.play(SINGLE) }

        game.score() shouldBe (1 to 0)
    }
}
