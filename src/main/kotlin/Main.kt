package baseball

import java.util.*

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

