fun calculateBugMentions(input: List<String>): Int {
    var c = 0
    for (i in input) {
        if (i.toString() == "BUG") {
            c += 1
        }
    }
    return c
}

fun main(args: Array<String>) {
    val str: String? = readLine()
    if (str != null) {
        calculateBugMentions(listOf(str))
    }
}