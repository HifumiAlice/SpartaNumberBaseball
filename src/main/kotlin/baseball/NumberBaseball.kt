package baseball.baseball

import baseball.global.Game

class NumberBaseball : Game() {

    override val name = "숫자 야구"

    val gameScore : MutableList<Int> = mutableListOf()
    val info = InformationPrint()
    override fun run() {
        while (true) {
            when (Person().selectMode()) {
                1 -> {
                    info.info("게임을 시작합니다.")
                    gameScore.add(PlayGame().run())
                    if(gameScore[gameScore.size - 1] == 1)
                        info.info("Congratulations!\n시도횟수 : ${gameScore[gameScore.size - 1]}")
                    else info.info("정답입니다.\n시도횟수 : ${gameScore[gameScore.size - 1]}")
                }
                2 -> info.recordPlay(gameScore)
                3 -> {
                    info.info("게임을 종료합니다.")
                    break
                }
            }
        }
    }

}