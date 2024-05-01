package game.baseball.parameterprint

import game.baseball.ParameterPrint

class PresentSituation : ParameterPrint() {
    private var strike : Int = 0
    private var ball : Int = 0

    override fun println() {
        println("=========================")
        if (strike == 0 && ball == 0) {
            println("현재 결과 : Nothing ")
        } else if (strike == 0) {
            println("현재 결과 : ${ball}볼 ")
        } else if (ball == 0) {
            println("현재 결과 : ${strike}스트라이크 ")
        } else {
            println("현재 결과 : ${strike}스트라이크 ${ball}볼 ")
        }
    }
    fun setStrikeAndBall(strike : Int, ball : Int) {
        this.strike = strike
        this.ball = ball
    }

//    fun setStrike(strike : Int) {
//        this.strike = strike
//    }
//    fun setBall(ball: Int) {
//        this.ball = ball
//    }
}