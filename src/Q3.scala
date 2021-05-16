object Q3 extends App {
 println("Question 3 >> Calculate total whole sale cost")

  val b = 24.95
  val  discount = 0.4
  val numofbooks = 60

  val totalCost = ( b * numofbooks )
  val totaldiscount = totalCost * discount

  def cal_shipping_cost ( numofcopies : Int ) : Double = {
   if (numofcopies <= 50) 3.0

   else 3.0 + ( 0.75 * (numofcopies - 50))
  }
  val  wholesalecost = totalCost - totaldiscount + cal_shipping_cost(numofbooks)

 println( "Total whole sale cost = " + wholesalecost)
}
