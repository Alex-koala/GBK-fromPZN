package com.example.gbk

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testPickRandomOption() {
        val option = listOf("ROCK", "PAPER", "SCISSORS")
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))

    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.paper, Game.pickDrawable("PAPER"))
        Assert.assertEquals(R.drawable.rock, Game.pickDrawable("ROCK"))
        Assert.assertEquals(R.drawable.scissors, Game.pickDrawable("SCISSORS"))

    }
}