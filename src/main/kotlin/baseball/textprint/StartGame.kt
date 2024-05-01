package game.baseball.textprint

import game.baseball.TextPrint

class StartGame : TextPrint() {
    override fun println() {
        println("=========================")
        println("게임을 시작합니다.")
    }
}