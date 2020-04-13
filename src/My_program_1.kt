fun calcChairs(bugs: Int): Int {
    val z = bugs / 2
    return bugs + z

}

fun main(args: Array<String>) {
    val bugsUser: String = readLine() ?: return
    val bugs:Int = bugsUser.toInt()
    val ReqChairs:Int =  calcChairs(bugs)
println("Required number of chairs is ${ReqChairs}")
}
