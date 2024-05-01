package game.baseball.wrongInput

import game.baseball.WrongInput

class WrongStartInput : WrongInput() {
    override fun println() {
        println("=========================")
        println("잘못된 입력입니다.")
        println("1,2,3 중 하나를 입력해주세요.")
    }
}