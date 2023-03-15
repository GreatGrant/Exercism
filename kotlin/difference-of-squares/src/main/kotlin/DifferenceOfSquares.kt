import kotlin.math.pow

class Squares(val numRange: Int) {

    // TODO: implement proper constructor

    fun sumOfSquares(): Int {
        var sum = 0
        (1..numRange).forEach { num ->
            sum += num.toDouble().pow(2.0).toInt()
        }
        return sum
    }

    fun squareOfSum(): Int {
        var sum = 0
        (1..numRange).forEach { num ->
            sum += num
        }
        return sum.toDouble().pow(2).toInt()
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
