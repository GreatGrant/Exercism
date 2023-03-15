import kotlin.math.pow

class Squares(val limit: Int) {

    // TODO: implement proper constructor

    fun sumOfSquares() =  (1..limit).map{ it * it }.sum()

    fun squareOfSum() = (1..limit).sum().toDouble().pow(2).toInt()

    fun difference() = squareOfSum() - sumOfSquares()
}
