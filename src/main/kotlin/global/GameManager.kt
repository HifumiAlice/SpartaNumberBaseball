package baseball.global

import baseball.baseball.InformationPrint
import baseball.baseball.NumberBaseball
import baseball.baseball.Person

class GameManager {

    private val game = NumberBaseball()
    private val info = InformationPrint()

    fun selectGame() {
            GameRunner().run(game)
        }
    }