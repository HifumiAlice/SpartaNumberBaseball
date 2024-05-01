package game.baseball.textprint

import game.baseball.TextPrint

class SelectPrint: TextPrint() {
    override fun println() {
        println("=========================")
        println("1. 게임시작 2. 기록보기 3. 게임종료")
        print("선택 : ")
    }
}