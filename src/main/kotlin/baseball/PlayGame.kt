package baseball.baseball

import java.util.*


class PlayGame() {
    private val answer : String = randomAnswer()
    private val person = Person()
    private val info = InformationPrint()

    fun run() : Int{
        var cnt : Int = 1

        while (true) {
            var strike : Int = 0
            var ball : Int = 0
            val answer = person.inputAnswer()

            if (answer == "cheat") {
                info.info("치트모드가 활성됩니다.\n정답은 ${this.answer}입니다.")
                continue
            }

            for (i in 0 .. 2) {
                if (answer[i] == this.answer[i]) strike++
                else if (answer[i] in this.answer) ball++
            }

            if (strike == 3)
                return cnt
            else {
                if (strike == 0 && ball == 0) {
                    info.info("현재 결과 : Nothing ")
                } else if (strike == 0) {
                    info.info("현재 결과 : ${ball}볼 ")
                } else if (ball == 0) {
                    info.info("현재 결과 : ${strike}스트라이크 ")
                } else {
                    info.info("현재 결과 : ${strike}스트라이크 ${ball}볼 ")
                }
            }

            cnt++

        }
    }

    fun randomAnswer() : String {
        val scanner = Scanner(System.`in`)
        var first : String = " "
        var second : String = " "
        var third : String = " "

        while (true) {
            if (first == " ") {
                first = (1..9).random().toString()
            } else if (second == " ") {
                second = (0..9).random().toString()
                if (second == first) second = " "
            } else {
                third = (0..9).random().toString()
                if (third == first || third == second) third = " "
            }

            if (first != " " && second != " " && third != " ") return first+second+third

        }
    }
}
