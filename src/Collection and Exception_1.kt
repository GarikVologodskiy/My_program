fun getCubeList(n: Int): List<Int> {
    return List<Int>(n, { n -> n * n * n })
 }

fun main(args: Array<String>) {
    println(getCubeList(7))
}
/*
Умение быстро возводить в куб целые числа является очень важным качеством для молодых пришельцев.
Настолько важным, что от экзаменационной оценки по данному предмету зависит дальнейшая судьба молодых гостей из космоса -
кто-то пойдет водить звездолет, а кто-то нет.

Реализуйте функцию getCubeList (n), возвращающую список целых чисел, состоящий из кубов порядковых номеров элементов от 0 до n-1 включительно.
Нумерация начинается с 0.

Из консоли/В консоль ничего читать/писать не нужно!
 */