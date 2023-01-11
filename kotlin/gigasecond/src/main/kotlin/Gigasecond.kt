import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond (var localDate: LocalDateTime){
    // TODO: Implement proper constructor
    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())

    val date: LocalDateTime = localDate.plusSeconds(1_000_000_000)
}
