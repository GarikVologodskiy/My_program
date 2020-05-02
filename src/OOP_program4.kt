open class Bug(val rank: Int, val name: String) {
    open fun getSugarLimit(): Int {
        return rank
    }

    open fun getId(): String = "level is ${rank}, name is ${name}"
}

class BugCivilian(rank: Int, name: String) : Bug(rank, name) {
    override fun getSugarLimit(): Int {
        return super.getSugarLimit() / 2
    }
    override fun getId(): String {
        return super.getId()
    }
}

fun main (args: Array<String>) {
    val human: BugCivilian = BugCivilian(
            rank = 45,
            name = "BigaBug"
    )
    println("Sugar limit eq ${human.getSugarLimit()}")
    println(human.getId())
}