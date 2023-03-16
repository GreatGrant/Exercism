import java.util.*

object Pangram {

    private val pangram = ('a'..'z').toSet()
    fun isPangram(input: String) = input
        .lowercase(Locale.getDefault())
        .filter { it in pangram }
        .toSet() == pangram
}
