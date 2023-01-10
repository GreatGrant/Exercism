object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var hammingDistance = 0

        if (leftStrand.length == rightStrand.length){
            val rightStrandArray = rightStrand.toCharArray()
            val leftStrandArray = leftStrand.toCharArray()

            leftStrandArray.forEachIndexed{ index, _ ->
                if (leftStrandArray[index] != rightStrandArray[index]) hammingDistance++
            }
        }else{
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        return hammingDistance
    }
}
