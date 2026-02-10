import java.lang.NumberFormatException

fun main()
{
    try {
        print("Введите год: ")
        var N = readln()!!.toInt()


        when {
            N % 100 == 0 -> {
                when {
                    N % 400 == 0 -> println("$N - високосный год")
                    else -> println("$N - не високосный год")
                }
            }
            N % 4 == 0 -> println("$N - високосный год")
            else -> println("$N - не високосный год")
        }



    }
    catch(e:NumberFormatException)
    {
        println("Неверный формат записи")
    }
}


