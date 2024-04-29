package baseball
import java.util.Scanner

val scanner = Scanner(System.`in`)

fun selectMode() : Int {

    var selectMode : Int

    while (true) {
        println("1. 게임시작 2. 기록보기 3. 게임종료")
        print("선택 : ")
        selectMode = scanner.nextInt()

        if (selectMode in 1..3) {
            return selectMode
        } else {
            println("=========================")
            println("잘못된 입력입니다.")
            println("1 ~ 3를 입력해주세요.")
            println("=========================")
        }
    }
}

fun inputAnswer() {

}