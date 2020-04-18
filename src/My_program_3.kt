fun getYearEra(numberOfYear: Int): String {
    return when {
        numberOfYear < 1970 -> "before"
        numberOfYear == 1970 -> "equals"
        numberOfYear in 1971..2000 -> "after (XX Century!)"
        numberOfYear in 2001..2100 -> "after (XXI Century!)"
        else -> "distant future"
    }
}

fun main(args: Array<String>) {
    val numberOfYearUser: String? = readLine()
    val numberOfYear:Int = numberOfYearUser?.toInt() ?:return
    getYearEra(numberOfYear).toString()
}