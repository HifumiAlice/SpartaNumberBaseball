package baseball.baseball

class InformationPrint {
    fun select(message: String) {
        println("=======================")
        print(message)
    }
    fun info(message: String) {
        println("=======================")
        println(message)
    }
    fun recordPlay(record : MutableList<Int>) {
        println("=========================")
        if(record.size == 0) println("기록이 없습니다.")
        else {
            println("기록을 확인합니다.")
            var idx = 1
//            for (i in record.indices) {
//                println("${i + 1}번째 게임 : 시도 횟수 - ${record[i]}")
//            }
            record.forEach{
                println("${idx++}번째 게임 : 시도 횟수 - ${it}")
            }
        }
    }

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
}