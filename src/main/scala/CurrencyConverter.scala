class CurrencyConverter {
  def convert(amount: Double, fromCurrency: Currency, toCurrency: Currency): Double = {
    amount * (fromCurrency.usdRate / toCurrency.usdRate)
  }
}
