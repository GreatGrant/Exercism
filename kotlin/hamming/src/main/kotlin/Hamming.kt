object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var hammingDistance = 0

        if (leftStrand.length == rightStrand.length){
            leftStrand.forEachIndexed{ index, _ ->
                if (leftStrand[index] != rightStrand[index]) hammingDistance++
            }
        }else{
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        return hammingDistance
    }
}
