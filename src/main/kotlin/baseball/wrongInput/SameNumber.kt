package game.baseball.wrongInput

import game.baseball.WrongInput

class SameNumber : WrongInput() {
    override fun println() {
            println("=========================")
            println("중복된 숫자가 올 수 없습니다.")
    }
}