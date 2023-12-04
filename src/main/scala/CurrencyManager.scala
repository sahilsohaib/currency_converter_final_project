import scala.collection.mutable

class CurrencyManager {
  private val currencies = mutable.Map[String, Currency]()

  def addNewCurrency(currency: Currency): Unit = {
    currencies += (currency.name -> currency)
  }

  def getCurrency(name: String): Option[Currency] = {
    currencies.get(name)
  }
}
