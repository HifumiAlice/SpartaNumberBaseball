package game.baseball.wrongInput

import game.baseball.WrongInput

class WrongNumber: WrongInput() {
    override fun println() {
        println("=========================")
        println("숫자를 입력해 주세요")
    }
}