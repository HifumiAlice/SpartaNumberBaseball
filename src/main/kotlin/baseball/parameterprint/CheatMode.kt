package game.baseball.parameterprint

import game.baseball.ParameterPrint

class CheatMode : ParameterPrint() {

    var str : String = ""

    override fun println() {
        println("=========================")
        println("치트모드가 활성됩니다.")
        println("정답은 ${str}입니다. ")
    }

    fun setCheatMode(str: String) {
        this.str = str
    }
}