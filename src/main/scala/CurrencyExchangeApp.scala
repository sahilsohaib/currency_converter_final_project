object CurrencyExchangeApp {
  def main(args: Array[String]): Unit = {
    val currencyManager = new CurrencyManager()
    val currencyConverter = new CurrencyConverter()
    val userIO = new UserIO()

    // Sample usage
    val usd = Currency("USD", 1.0)
    currencyManager.addNewCurrency(usd)

    val inr = Currency("INR", 73.0)
    currencyManager.addNewCurrency(inr)

    val gbp = Currency("GBP", 0.78)
    currencyManager.addNewCurrency(gbp)

    // Adding a new currency through user input
    val newCurrency = userIO.inputCurrency("Add a new currency. ")
    currencyManager.addNewCurrency(newCurrency)

    // Getting a currency by name
    val currencyName = userIO.repeatedInput("Enter currency name to retrieve: ")
    val retrievedCurrency = currencyManager.getCurrency(currencyName)

    retrievedCurrency match {
      case Some(currency) =>
        println(s"Currency ${currency.name} found with USD rate: ${currency.usdRate}")
      case None =>
        println(s"Currency $currencyName not found.")
    }

    // Performing currency conversion
    val amount = userIO.repeatedInput("Enter the amount to convert: ").toDouble
    val fromCurrency = userIO.inputCurrency("Enter the source currency. ")
    val toCurrency = userIO.inputCurrency("Enter the target currency. ")

    val convertedAmount = currencyConverter.convert(amount, fromCurrency, toCurrency)
    println(s"$amount ${fromCurrency.name} is equal to $convertedAmount ${toCurrency.name}")
  }
}
