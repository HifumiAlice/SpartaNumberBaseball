package game

import game.baseball.Input
import game.baseball.PlayGame
import game.baseball.TextPrint
import game.baseball.parameterPrint

class Game {
    fun startGame() {
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
//                TextPrint.endGame()
                    PrintLog.printLines(TextPrint.endGame())
                    break
                }
            }
        }

    }
}


fun main() {
    Game().startGame()
}


/**
 명사
 - 사용자
    - 정답을 입력한다.
 - 게임
    - 시작
    - 종료

    # 상태값
      # 진행중 상태
      # 멈춤
 - 사용자의 게임 기록
    - 저장한다
    - 출력한다

 */


enum class GameStatus {
    IN_PLAY,
}

