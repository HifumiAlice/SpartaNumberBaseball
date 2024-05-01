package game

import game.baseball.Input
import game.baseball.PlayGame
import game.baseball.TextPrint
import game.baseball.parameterPrint

fun main() {

    val gameScore : MutableList<Int> = mutableListOf()

    while (true) {
        when (Input.selectMode()) {
            1 -> {
                TextPrint.gameStart()
                gameScore.add(PlayGame().run())
                parameterPrint.equalAnswer(gameScore[gameScore.size - 1])
            }
            2 -> parameterPrint.recordPlay(gameScore)
            3 -> {
                TextPrint.endGame()
                break
            }
        }
    }



}
