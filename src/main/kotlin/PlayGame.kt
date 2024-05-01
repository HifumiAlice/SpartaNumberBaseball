package baseball


class PlayGame() {
    private val answer : String = Input.randomAnswer()

    fun run() : Int{
        var cnt : Int = 1

        while (true) {
            var strike : Int = 0
            var ball : Int = 0
            val answer = Input.inputAnswer()

            if (answer == "cheat") {
                parameterPrint.cheatMode(this.answer)
//                return -1
                continue
            }

            for (i in 0 .. 2) {
                if (answer[i] == this.answer[i]) strike++
                else if (answer[i] in this.answer) ball++
            }

            if (strike == 3)
                return cnt
            else parameterPrint.presentSituation(strike, ball)

            cnt++

        }
    }
}
