package game.baseball.textprint

import game.baseball.TextPrint

class EndGame : TextPrint() {
    override fun println() {
        println("=========================")
        println("게임을 종료합니다.")
    }
}