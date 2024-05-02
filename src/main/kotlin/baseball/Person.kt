package baseball.baseball

import java.util.*

class Person {
    private val scanner = Scanner(System.`in`)
    private val info = InformationPrint()

    fun selectGame(size : Int) : Int{
        var selectGame : Int

        while (true) {
            try {
                selectGame = scanner.next().toInt()
                if (selectGame <= 0 || selectGame > size)
                    info.info("1부터 ${size}중에서 골라주세요")
                return selectGame
            } catch (e : Exception) {
                info.info("숫자를 입력해주세요")
            }
        }

    }
    fun selectMode() : Int {

        var selectMode : Int

        while (true) {
            info.select("1. 게임시작 2. 기록보기 3. 게임종료\n선택 : ")

            try {
                selectMode = scanner.next().toInt()
                if (selectMode in 1..3 ) {
                    return selectMode
                } else {
                    info.info("잘못된 입력입니다.\n1,2,3 중 하나를 입력해주세요")

                }
            } catch (e : NumberFormatException) {
                info.info("잘못된 입력입니다. \n1,2,3 중 하나를 입력해주세요")

            }
        }
    }

    fun inputAnswer() : String{

        var input : String

        while (true) {
            info.select("세 자리 수를 입력해 주세요 \n" + "ex) 123 / 714\n" + "입력 : ")

            input = scanner.next()

            if (input == "cheat") return input

            if (input.length != 3) {
                info.info("세자리 수를 입력해 주세요")
                continue
            } else if (input[0] == '0') {
                info.info("첫 자리에는 0이 올 수 없습니다.\n다시 입력해주세요")
                continue
            } else if (input[0] == input[1] || input[1] == input[2] || input[2] == input[0]) {
                info.info("중복된 숫자가 올 수 없습니다.")
                continue
            }

            try {
                input.toInt()
                return  input
            } catch (e: NumberFormatException) {
                info.info("숫자를 입력해주세요")
            }

        }

    }
}