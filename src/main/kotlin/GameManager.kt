package baseball

class GameManager {

    val gameList : MutableList<Game> = mutableListOf(NumberBaseball())
    val info = InformationPrint()

    fun selectGame() {
        if (gameList.size == 0) {
            info.info("실행할 수 있는 게임이 없습니다.")
            return
        } else {
            info.info("게임목록\n")
            for (i in gameList.indices) {
                println("${i+1}번 게임 : ${gameList[i].name}")
            }
            info.select("시작할 게임 번호를 입력해주세요\n입력 : ")
            GameRunner().run(gameList[Person().selectGame(gameList.size)-1])
        }
    }



}