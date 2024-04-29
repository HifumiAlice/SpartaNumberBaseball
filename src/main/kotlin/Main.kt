package baseball

fun main() {

    val gameScore : MutableList<Int> = mutableListOf()

    while (true) {
        when (selectMode()) {
            1 -> {
                gameStart() // 게임 방법 안내
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

