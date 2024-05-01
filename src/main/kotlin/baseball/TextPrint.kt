package game.baseball

import game.PrintLog

open class TextPrint : PrintLog {
    override fun println() {
        println("============")
        println("자식 객체를 내놔라")
    }
}