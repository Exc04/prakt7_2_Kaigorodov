import java.lang.NumberFormatException

fun main()
{
    try {
        print("Введите высоту отверстия: ")
        var A = readln()!!.toDouble()

        print("Введите ширину отверстия: ")
        var B = readln()!!.toDouble()

        print("Введите высоту кирпича: ")
        var y = readln()!!.toDouble()

        print("Введите ширину кирпича: ")
        var x = readln()!!.toDouble()

        print("Введите длину кирпича: ")
        var z = readln()!!.toDouble()

        if(A <= 0 || B <= 0 || x <= 0 || y <= 0 || z <= 0)
        {
            println("Размеры должны быть больше 0")
            return
        }

        var otvet = when {
            (x <= A && y <= B) || (y <= A && x <= B) -> "Кирпич проходит в отверстие"
            (x <= A && z <= B) || (z <= A && x <= B) -> "Кирпич проходит в отверстие"
            (y <= A && z <= B) || (z <= A && y <= B) -> "Кирпич проходит в отверстие"
            else -> "Кирпич не проходит в отверстие"
        }

        println(otvet)


    }
    catch(e:NumberFormatException)
    {
        println("Неверный формат записи")
    }
}



