/* Easy - Do I get a Bonus?
Write a function that takes two arguments: salary (`Int`) and bonus (`Boolean`).
If bonus is `true`, return the salary plus 20%, rounded down. Otherwise, return the salary.
You should return the answer as a string, prefixed with `£`.

Examples
- Given 100 and true, return "£120"
- Given 100 nd false, return "100"
- Given 99 and true, return "£118"
*/

import scala.io.StdIn

object BonusCalc extends App {

  def calculateBonus(salary: Int, bonus: Boolean): Unit = {
    if (bonus == true) {
      val bonusReturn = salary * 20 / 100
      val brInt = salary + bonusReturn
      println(s"£$brInt")
    }
    else {
      println(s"£$salary")
    }
  }

  BonusCalc.calculateBonus(100, true)
  BonusCalc.calculateBonus(100, false)
  BonusCalc.calculateBonus(99, true)
}
