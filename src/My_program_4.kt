fun calculateEvenDigits(input: String): Int {
    var c = 0
    for (i in input) {
        if (i.toString().toInt() % 2 == 0) {
            c += i.toString().toInt()
        }
    }
    return c
}