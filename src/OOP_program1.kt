class NibirunianClass(s: String) {
    lateinit var namePlate: String
    fun createNamePlate(name: String) {
        namePlate = "Live long and prosper, $name"
    }
}

/*
в Kotlin'е есть ключевое слово lateinit, позволяющее определить свойство без его инициализации:
Я так понимаю, что если не использовать lateinit при декларации в не абстрактном классе и не инициализировать свойство, это вызовет ошибку компиляции; очень обидно, что в рамках курса на это не обратили должного внимания
*/