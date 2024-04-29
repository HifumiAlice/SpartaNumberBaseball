package baseball

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
    println("=========================")
}

fun lengthPrint() {
    println("=========================")
    println("세자리 수를 입력해 주세요")
    println("=========================")
}

fun firstZero() {
    println("=========================")
    println("첫 자리에는 0이 올 수 없습니다.")
    println("다시 입력해주세요")
    println("=========================")
}

fun sameNumber() {
    println("=========================")
    println("중복된 숫자가 올 수 없습니다.")
    println("=========================")
}

fun inputNumber() {
    println("=========================")
    println("숫자를 입력해 주세요")
    println("=========================")
}

fun wrongStartInput() {
    println("=========================")
    println("잘못된 입력입니다.")
    println("1 ~ 3를 입력해주세요.")
    println("=========================")
}

fun endGame() {
    println("=========================")
    println("게임을 종료합니다.")
    println("=========================")
}

fun gameStart() {
    println("=========================")
    println("게임을 시작합니다.")
    println("=========================")
}

fun equalAnswer(count : Int) {
    println("=========================")
    println("정답입니다.")
    println("시도횟수 : ${count}")
    println("=========================")
}

fun recordPlay(record : MutableList<Int>) {
    println("=========================")
    println("기록을 확인합니다.")
    for (i in record.indices) {
        println("${i+1}번째 게임 : 시도 횟수 - ${record[i]}")
    }
}