package baseball

class WrongInput {
    companion object {
        fun lengthPrint() {
            println("=========================")
            println("세자리 수를 입력해 주세요")
        }

        fun firstZero() {
            println("=========================")
            println("첫 자리에는 0이 올 수 없습니다.")
            println("다시 입력해주세요")
        }

        fun sameNumber() {
            println("=========================")
            println("중복된 숫자가 올 수 없습니다.")
        }

        fun wrongNumber() {
            println("=========================")
            println("숫자를 입력해 주세요")
        }

        fun wrongStartInput() {
            println("=========================")
            println("잘못된 입력입니다.")
            println("1,2,3 중 하나를 입력해주세요.")
        }

        fun wrongStartInputString() {
            println("=========================")
            println("문자가 입력됐습니다.")
            println("숫자를 입력해주세요")
        }
    }
}

class TextPrint {
    companion object {

        fun endGame() {
            println("=========================")
            println("게임을 종료합니다.")
            println("=========================")
        }

        fun gameStart() {
            println("=========================")
            println("게임을 시작합니다.")
        }

        fun selectPrint() {
            println("=========================")
            println("1. 게임시작 2. 기록보기 3. 게임종료")
            print("선택 : ")
        }

        fun inputPrint() {
            println("=========================")
            println("세 자리 수를 입력해 주세요 \nex) 123 / 714")
            print("입력 : ")
        }


    }

}

class parameterPrint {
    companion object {
        fun presentSituation(strike : Int, ball : Int ) {
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

        fun equalAnswer(count : Int) {
            println("=========================")
            if (count == 1)  println("Congratulations!")
            else  println("정답입니다.")

            println("시도횟수 : ${count}")
        }

        fun recordPlay(record : MutableList<Int>) {
            println("=========================")
            if(record.size == 0) println("기록이 없습니다.")
            else {
                println("기록을 확인합니다.")
                for (i in record.indices) {
                    println("${i + 1}번째 게임 : 시도 횟수 - ${record[i]}")
                }
            }
        }

        fun cheatMode(str : String) {
            println("=========================")
            println("치트모드가 활성됩니다.")
            println("정답은 ${str}입니다. ")
        }

    }
}

