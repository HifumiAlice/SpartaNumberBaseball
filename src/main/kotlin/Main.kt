package baseball

fun main() {

    val gameScore : MutableList<Int> = mutableListOf()

    while (true) {
        when (selectMode()) {
            1 -> {
                gameStart()
                gameScore.add(PlayGame().run())
                equalAnswer(gameScore[gameScore.size - 1])
            }
            2 -> recordPlay(gameScore)
            3 -> {
                endGame()
                break
            }
        }
    }


}

