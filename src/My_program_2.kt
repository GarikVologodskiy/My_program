fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    val uniConst = 42

    return (dayNumber * bugRank + uniConst) * cashAmount
}

fun main(args: Array<String>) {
    val dayNumberUser: String = readLine()?: return
    val bugRankUser: String = readLine()?: return
    val cashAmountUser: String = readLine()?: return
    val dayNumber:Int = dayNumberUser.toInt()
    val bugRank:Int = bugRankUser.toInt()
    val cashAmount:Int = cashAmountUser.toInt()
    val sugarQt:Int = calcBugMoneyValue(dayNumber,bugRank,cashAmount)

    println("Your quantity of sugar is ${sugarQt}")
}