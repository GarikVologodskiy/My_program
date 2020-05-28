class DogException() : Exception()
class CatException() : Exception()

@Throws(DogException::class, CatException::class)
fun checkClient(client: String) {
    if (client == "dog") throw DogException()
    if (client == "cat") throw CatException()
}

fun main(args: Array<String>) {
    val client = readLine()
    if (client != null) {
        checkClient(client)
    }
}

/* Examples
class DogException() : Exception()
class CatException() : Exception()
// write your code here
fun checkClient(client : String){
    when{
        client.contains("dog")-> throw DogException()
        client.contains("cat")-> throw CatException()
    }
}
*/