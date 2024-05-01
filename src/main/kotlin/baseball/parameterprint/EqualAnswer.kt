package game.baseball.parameterprint

import game.baseball.ParameterPrint

class EqualAnswer : ParameterPrint() {
    var count : Int = 0
    override fun println() {
        println("=========================")
        if (count == 1)  println("Congratulations!")
        else  println("정답입니다.")

        println("시도횟수 : ${count}")
    }
    fun setCount(count : Int) {
        this.count = count
    }
}