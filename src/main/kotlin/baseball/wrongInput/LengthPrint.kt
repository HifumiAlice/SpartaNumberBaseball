package game.baseball.wrongInput

import game.baseball.WrongInput

class LengthPrint : WrongInput() {
    override fun println() {
        println("=========================")
        println("세자리 수를 입력해 주세요")
    }
}