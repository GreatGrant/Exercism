object ScrabbleScore {

    private val letterValues = mapOf(
        1 to listOf('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'),
        2 to listOf('D', 'G'),
        3 to listOf('B', 'C', 'M', 'P'),
        4 to listOf('F', 'H', 'V', 'W', 'Y'),
        5 to listOf('K'),
        8 to listOf('J', 'X'),
        10 to listOf('Q', 'Z')
    )

    fun scoreLetter(c: Char): Int {
        for (score in letterValues.keys){
            if(c.toUppercase() in letterValues[score]){
                return score
            }
        }

    }

    fun scoreWord(word: String): Int {
        var score = 0
        for(c in word.toUppercase())
            score += scoreLetter(c)
        }
    return score
    }
}
