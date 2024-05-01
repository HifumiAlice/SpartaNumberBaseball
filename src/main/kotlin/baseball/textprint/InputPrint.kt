package game.baseball.textprint

import game.baseball.TextPrint

class InputPrint: TextPrint() {
    override fun println() {
        println("=========================")
        println("세 자리 수를 입력해 주세요 \nex) 123 / 714")
        print("입력 : ")
    }
}