package game.baseball
import java.util.Scanner

class Input {

    companion object {
        val scanner = Scanner(System.`in`)

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

        fun selectMode() : Int {

            var selectMode : Int

            while (true) {
                TextPrint.selectPrint()

                try {
                    selectMode = scanner.next().toInt()
                    if (selectMode in 1..3 ) {
                        return selectMode
                    } else {
                        WrongInput.wrongStartInput()
                    }
                } catch (e : NumberFormatException) {
                    WrongInput.wrongStartInput()
                }
            }
        }

        fun inputAnswer() : String{

            var input : String

            while (true) {
                TextPrint.inputPrint()
                input = scanner.next()

                if (input == "cheat") return input

                if (input.length != 3) {
                    WrongInput.lengthPrint()
                    continue
                } else if (input[0] == '0') {
                    WrongInput.firstZero()
                    continue
                } else if (input[0] == input[1] || input[1] == input[2] || input[2] == input[0]) {
                    WrongInput.sameNumber()
                    continue
                }

                try {
                    input.toInt()
                    return  input
                } catch (e: NumberFormatException) {
                    WrongInput.wrongNumber()
                }

            }

        }
    }


}
















