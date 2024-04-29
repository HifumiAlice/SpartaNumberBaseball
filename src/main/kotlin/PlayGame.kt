package baseball


class PlayGame() {
    val answer : String = randomAnswer()

    fun run() : Int{
        var cnt : Int = 1

        while (true) {
            var strike : Int = 0
            var ball : Int = 0
            val answer = inputAnswer()

            if (answer[0] == this.answer[0]) strike++
            else if (answer[0] in this.answer) ball++

            if (answer[1] == this.answer[1]) strike++
            else if (answer[1] in this.answer) ball++

            if (answer[2] == this.answer[2]) strike++
            else if (answer[2] in this.answer) ball++

            if (strike == 3)
                return cnt
            else presentSituation(strike, ball)

            cnt++

        }
    }
}
