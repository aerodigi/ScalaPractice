import BonusCalc.{bonus, salary}

import scala.io.StdIn

object BonusCalc extends App {
  println("What is your salary? ")
  val salary: Int = StdIn.readInt()
  println("Bonus - true or false? ")
  val bonus: Boolean = StdIn.readBoolean()

  def calculateBonus(salary: Int, bonus: Boolean): Unit = {
    val salaryFloat = salary.toFloat
    if (bonus == true) {
      val bonusReturn = salaryFloat * 20 / 100
      val brInt = salaryFloat.toInt + bonusReturn.toInt
      println(s"£$brInt")
    }
    else {
      val salaryInt = salaryFloat.toInt
      println(s"£$salaryInt")
    }
  }

  BonusCalc.calculateBonus(salary, bonus)
  // DoIGetABonus.calculateBonus("200", "false")
}
