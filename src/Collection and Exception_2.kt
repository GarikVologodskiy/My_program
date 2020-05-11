import kotlin.toString as toString1

fun calculateWordStat(input: String): String {
    println("${input}".split(' ').groupingBy { it }.eachCount().maxBy() { it.value }.toString1().substringBefore("="))
    return "${input}".split(' ').groupingBy { it }.eachCount().maxBy() { it.value }.toString1().substringBefore("=")
    }

fun main(args: Array<String>) {
    val str = readLine()?.split(' ')
    if (str != null) {
        calculateWordStat(str.toString())
    }
}

/*
Простые работники посольства пришельцев столкнулись с новой проблемой - принцип сортировки бумаг изменился!
Для того чтобы понять, к кому из послов относится сообщение, необходимо найти самое часто употребляемое слово.
Оно и будет именем ответственного лица.
Реализуйте функцию calculateWordStat,aкоторая находит самое часто употребляемое слово в строке.
Инициализация списков и массивов очень похожа. Для примера ниже опишем способы инициализации для массива целых чисел:

val array1 : Array<Int> = emptyArray() // пустой массив
val array2 : Array<Int> = arrayOf(1,2,3,4) // массив из элементов 1,2,3,4
val array3 : Array<Int> = Array<Int>(10, {i -> i*i}) // массив из 10 элементов - квадратов 0-9

Для списков ситуация аналогичная:
val list1 : List<Int> = emptyList() // пустой список
val list2 : List<Int> = listOf(1,2,3,4) // список из элементов 1,2,3,4
val list3 : List<Int> = List<Int>(10, {i -> i*i}) // список из 10 элементов - квадратов чисел от 0 до 9 (будет создан ArrayList)
val list4 : MutableList<Int> = MutableList<Int>(10, {i -> i*i}) // список из 10 элементов - квадратов чисел от 0 до 9 (будет создан ArrayList)
 */