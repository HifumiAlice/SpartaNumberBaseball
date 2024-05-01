package game.baseball.parameterprint

import game.baseball.ParameterPrint

class RecordPlay : ParameterPrint() {
    var record : MutableList<Int> = mutableListOf()
    override fun println() {
        println("=========================")
        if(record.size == 0) println("기록이 없습니다.")
        else {
            println("기록을 확인합니다.")
            for (i in record.indices) {
                println("${i + 1}번째 게임 : 시도 횟수 - ${record[i]}")
            }
        }
    }

    fun setRecord(record: MutableList<Int>) {
        this.record = record
    }
}