data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            this.year != other.year -> this.year.minus(other.year)
            this.month != other.month -> this.month.minus(other.month)
            else -> this.dayOfMonth.minus(other.dayOfMonth)
        }
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
