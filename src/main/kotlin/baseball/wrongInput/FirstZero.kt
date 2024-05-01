package game.baseball.wrongInput

import game.baseball.WrongInput

class FirstZero: WrongInput() {
    override fun println() {
        println("=========================")
        println("첫 자리에는 0이 올 수 없습니다.")
        println("다시 입력해주세요")
    }
}