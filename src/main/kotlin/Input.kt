package baseball
import java.util.Scanner

val scanner = Scanner(System.`in`)

fun selectMode() : Int {

    var selectMode : Int

    while (true) {
        selectPrint()
        selectMode = scanner.nextInt()

        if (selectMode in 1..3) {
            return selectMode
        } else {
            wrongStartInput()
        }
    }
}

fun inputAnswer() : String{
//    var
    var number : Int
    var input : String


    while (true) {
        inputPrint()
        input = scanner.next()

        if (input.length != 3) {
            lengthPrint()
            continue
        } else if (input[0] == '0') {
            firstZero()
            continue
        } else if (input[0] == input [1] || input[1] == input[2] || input[2] == input[0]) {
            sameNumber()
            continue
        }

        try {
            input.toInt()
            return  input
        } catch (e: NumberFormatException) {
            wrongNumber()
            continue
        }

    }

}

fun randomAnswer() : String {
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













