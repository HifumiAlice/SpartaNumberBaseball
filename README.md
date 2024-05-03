### 스파르타코딩클럽 Kotlin2기 최민수의 숫자 야구 게임 과제 폴더입니다.
-------

### 프로젝트 소개

숫자야구 게임입니다.

세자리 숫자가 정해져 있습니다. (중복된 숫자는 없음)

각 자리 수는 0~9 사이입니다. 단 첫번째 수는 0이 올 수 없습니다.

사용자는 세 자리 숫자를 입력해서 숫자가 맞는지를 확인합니다.

만약 사용자가 입력한 숫자와 정해진 숫자의 자리가 같다면 스트라이크

자리가 같진 않지만 숫자가 포함된다면 볼 입니다.

만약 하나도 없다면 Nothing이 됩니다.

ex) 정답 : 421 / 입력 : 128 --> 1스트라이크 1볼

ex) 정답 : 147 / 입력 : 953 --> Nothing

스트라이크가 3번 되면 게임이 끝납니다.

ex) 정답 : 107 / 입력 : 107 --> 3스트라이크 종료

-----------

### 개발기간

2024-04-29(월) ~ 2024-05-03(금)

--------

### 개발환경

IDE : IntelliJ

JDK : 21.0.1

프로그램 언어 : Kotlin 1.9

----------

### 구현기능

1. 공통부분
   + 공통부분에서는 나중에 추가 확장성을 생각해서 만들었습니다.
   + 예를 들어 게임이 추가 됐을 때 원하는 게임을 선택하는 것
2. 야구게임
  + NumberBaseball - 야구게임의 실행 담당
  + PlayGame - 야구게임 진행
  + Person - 야구게임 하는 사용자
  + InformationPrint - 안내문 표시
    
----------

**공통부분**

+ Game 클래스 - 추상클래스
  

      abstract class Game {
          abstract val name : String
          abstract fun run()
      }


  + name 변수는 게임의 이름을 저장합니다.
  + run 메소드는 게임을 실행합니다.

+ GameManager 클래스
  
      class GameManager {
      
          private val gameList: MutableList<Game> = mutableListOf(NumberBaseball())
          private val info = InformationPrint()
      
          fun selectGame() {
              if (gameList.size == 0) {
                  info.info("실행할 수 있는 게임이 없습니다.")
                  return
              } else {
                  info.info("게임목록")
                  for (i in gameList.indices) {
                      println("${i + 1}번 게임 : ${gameList[i].name}")
                  }
                  info.select("시작할 게임 번호를 입력해주세요\n입력 : ")
                  GameRunner().run(gameList[Person().selectGame(gameList.size) - 1])
              }
          }
      }


  + gameList 변수는 실행할 게임 목록이 저장됩니다.
  + selectGame 메소드는 목록에 있는 게임을 실행합니다.

+ GameRunner 클래스
  

      class GameRunner {
          fun run(game : Game) {
              game.run()
          }
      }
  

  + run 메소드는 Game 타입을 받아서 게임을 실행합니다.
 
---------------

**야구게임**

+ NumberBaseball

      class NumberBaseball : Game() {
      
          override val name = "숫자 야구"
      
          private val gameScore : MutableList<Int> = mutableListOf()
          private val info = InformationPrint()
      
          override fun run() {
              while (true) {
                  when (Person().selectMode()) {
                      1 -> {
                          info.info("게임을 시작합니다.")
                          gameScore.add(PlayGame().run())
                          info.equalAnswer(gameScore[gameScore.size - 1])
                      }
                      2 -> info.recordPlay(gameScore)
                      3 -> {
                          info.info("게임을 종료합니다.")
                          break
                      }
                  }
              }
          }
      
      }

  + run 메소드는 게임을 시작할 지 기록을 볼 지 게임을 종료할 지 선택합니다.

+ PlayGame
  
      class PlayGame() {
          private val answer : String = randomAnswer()
          private val person = Person()
          private val info = InformationPrint()
      
          fun run() : Int{
              var cnt : Int = 1
      
              while (true) {
                  var strike : Int = 0
                  var ball : Int = 0
                  val answer = person.inputAnswer()
      
                  if (answer == "cheat") {
                      info.info("치트모드가 활성됩니다.\n정답은 ${this.answer}입니다.")
                      continue
                  }
      
                  for (i in 0 .. 2) {
                      if (answer[i] == this.answer[i]) strike++
                      else if (answer[i] in this.answer) ball++
                  }
      
                  if (strike == 3)
                      return cnt
                  else {
                      info.presentSituation(strike,ball)
                  }
      
                  cnt++
      
              }
          }
      
          fun randomAnswer() : String {
              val scanner = Scanner(System.`in`)
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
      }

  + 게임이 실행되면 randomAnswer 메소드를 통해 100 ~ 999의 서로 다른 무작위 숫자가 생성됩니다.
  + run 메소드에서는 사용자의 입력값이 정답이랑 비교해서 스트라이크 및 볼을 판단합니다.
  + 만약 cheat가 입력되면 정답을 보여줍니다.
  + 숫자를 맞추면 게임이 끝납니다.
    
+ Person
  
      class Person {
          private val scanner = Scanner(System.`in`)
          private val info = InformationPrint()
      
          fun selectGame(size : Int) : Int{
              var selectGame : Int
      
              while (true) {
                  try {
                      selectGame = scanner.next().toInt()
                      if (selectGame <= 0 || selectGame > size)
                          info.info("1부터 ${size}중에서 골라주세요")
                      return selectGame
                  } catch (e : Exception) {
                      info.info("숫자를 입력해주세요")
                  }
              }
      
          }
          fun selectMode() : Int {
      
              var selectMode : Int
      
              while (true) {
                  info.select("1. 게임시작 2. 기록보기 3. 게임종료\n선택 : ")
      
                  try {
                      selectMode = scanner.next().toInt()
                      if (selectMode in 1..3 ) {
                          return selectMode
                      } else {
                          info.info("잘못된 입력입니다.\n1,2,3 중 하나를 입력해주세요")
      
                      }
                  } catch (e : NumberFormatException) {
                      info.info("잘못된 입력입니다. \n1,2,3 중 하나를 입력해주세요")
      
                  }
              }
          }
      
          fun inputAnswer() : String{
      
              var input : String
      
              while (true) {
                  info.select("세 자리 수를 입력해 주세요 \n" + "ex) 123 / 714\n" + "입력 : ")
      
                  input = scanner.next()
      
                  if (input == "cheat") return input
      
                  if (input.length != 3) {
                      info.info("세자리 수를 입력해 주세요")
                      continue
                  } else if (input[0] == '0') {
                      info.info("첫 자리에는 0이 올 수 없습니다.\n다시 입력해주세요")
                      continue
                  } else if (input[0] == input[1] || input[1] == input[2] || input[2] == input[0]) {
                      info.info("중복된 숫자가 올 수 없습니다.")
                      continue
                  }
      
                  try {
                      input.toInt()
                      return  input
                  } catch (e: NumberFormatException) {
                      info.info("숫자를 입력해주세요")
                  }
      
              }
      
          }
      }

  + selectGame 메소드는 실행할 게임을 선택합니다. --> 현재는 야구게임밖에 없음
  + selectMode 메소드는 야구게임에서 실행할지 기록 볼지 종료할지를 선택합니다.
  + inputAnswer 메소드는 세자리 숫자를 입력받습니다.
    + 중복숫자가 있는지, 숫자가 아닌지, 세자리숫자인지를 판단합니다.
  
+ InformationPrint

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
      
                  for (i in record.indices) {
                      println("${i + 1}번째 게임 - 시도 횟수 : ${record[i]}")
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

  + 메시지를 보여주는 클래스입니다.
  
