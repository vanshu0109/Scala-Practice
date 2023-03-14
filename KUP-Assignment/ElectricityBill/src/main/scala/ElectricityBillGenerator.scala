
case class ElectricityBillGenerator(accountNumber: Int, username: String, address: String, previousUnit: Int, currentUnit: Int) {
  require(accountNumber > 0, "Account number should be greater than zero")
  require(currentUnit >= previousUnit, "Current unit should be greater than or equal to previous unit")
  require(previousUnit > 0, "Previous unit cannot be less than or equal to zero")
}

object ElectricityBillCalculator {
  //Method to calculate bill based on the print unit slab
  def calculateBill(Bill: ElectricityBillGenerator): Double = {
    val unitsConsumed = Bill.currentUnit - Bill.previousUnit
    val priceUnitSlab = {
      if (unitsConsumed <= 250) unitsConsumed * 5.25
      else if (unitsConsumed <= 450) 5.25 * 250 + (unitsConsumed - 450) * 6.75
      else 250 * 5.25 + (450 - 250) * 6.75 + (unitsConsumed - 450) * 8.5
    }
    //Calculate gst charges
    val gstCharges = priceUnitSlab * 0.18
    val totalAmount = priceUnitSlab + gstCharges
    totalAmount
  }
}

