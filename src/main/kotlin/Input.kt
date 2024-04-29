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

fun inputAnswer() : String{
//    var
    var number : Int
    var input : String


    while (true) {
        println("세 자리 수를 입력해 주세요 \nex) 123 / 714")
        print("입력 : ")
        input = scanner.next()

        if (input.length != 3) {
            println("=========================")
            println("세자리 수를 입력해 주세요")
            println("=========================")
            continue
        } else if (input[0] == '0') {
            println("=========================")
            println("첫 자리에는 0이 올 수 없습니다.")
            println("다시 입력해주세요")
            println("=========================")
            continue
        } else if (input[0] == input [1] || input[1] == input[2] || input[2] == input[0]) {
            println("=========================")
            println("중복된 숫자가 올 수 없습니다.")
            println("=========================")
            continue
        }

        try {
            input.toInt()
            return  input
        } catch (e: NumberFormatException) {
            println("=========================")
            println("숫자를 입력해 주세요")
            println("=========================")
            continue
        }

    }

}












