import scala.io.StdIn

class UserIO {
  def repeatedInput(prompt: String): String = {
    print(prompt)
    StdIn.readLine()
  }

  def inputCurrency(prompt: String): Currency = {
    val name = repeatedInput(prompt + "Currency Name: ")
    val rate = repeatedInput(prompt + "USD Rate: ").toDouble
    Currency(name, rate)
  }
}

