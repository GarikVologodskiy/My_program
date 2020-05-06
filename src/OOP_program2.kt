class SugarStorageUni(var volume: Int = 50) {
    fun decreaseSugar(v: Int) {
        if (v < 0) {
            /*var v = v + (2*(-1*v))*/ /*hand-method to change from negative to positive*/
            val v = -v
            if (v >= volume) {
                resetVolume()
            } else volume -= v
            println(message = "volume level ${volume}, --vN = ${v}")
            return
        }
        if (v >= volume) {
            resetVolume()
        } else volume -= v
        println(message = "volume level ${volume}, --vP = ${v}")
        return
    }

    private fun resetVolume() {
        volume = 0
        println(message = "volume level = ${volume}")
    }

    fun increaseSugar(v: Int) {
        if (v < 0) {
            val v = -v
            volume += v
            println(message = "volume level ${volume}, ++vN = ${v}")
            return
        } else volume += v
        println(message = "volume level ${volume}, ++vP = ${v}")
        return
    }
}

fun main(args: Array<String>) {
    var s: SugarStorageUni = SugarStorageUni(volume = 10624)

    s.increaseSugar(1237)
}

/*Земные программисты так сильно впечатлили пришельцев, что те доверили землянам создать ПО для работы главного финансового учреждения в Созвездии Жука - сахарного хранилища.

Создайте класс для сахарного хранилища SugarStorage. Класс должен реализовывать следующие методы:

первичный конструктор, инициализирующий начальный баланс хранилища.
decreaseSugar(v:Int) - уменьшить баланс хранилища на v.
increaseSugar(v:Int) - увеличить баланс хранилища на v.
Также класс должен обладать публичным свойством volume:Int, задающим текущий баланс хранилища.

Обратите внимание, что

volume не может быть отрицательным. При попытке уменьшить баланс на величину, превышающую volume, значение volume должно становиться нулем.
decreaseSugar и increaseSugar должны игнорировать отрицательные аргументы.*/