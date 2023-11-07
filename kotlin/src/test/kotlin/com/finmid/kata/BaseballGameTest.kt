package com.finmid.kata

import com.finmid.kata.Play.HOMERUN
import com.finmid.kata.Play.OUT
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
}
