package baseball

class GameManager {

    private val game = NumberBaseball()
    private val info = InformationPrint()

    fun selectGame() {
            GameRunner().run(game)
        }
    }