import java.lang.NumberFormatException

fun main()
{
    try {
            print("Введите первое число: ")
            var a = readln()!!.toDouble()

            print("Введите второе число: ")
            var b = readln()!!.toDouble()

            print("Введите третье число: ")
            var c = readln()!!.toDouble()


            println("Числа от 1 до 3 :")

            when {
                a > 1 && a < 3 -> println(a)
            }

            when {
                b > 1 && b < 3 -> println(b)
            }

            when {
                c > 1 && c < 3 -> println(c)
            }



    }
    catch(e:NumberFormatException)
    {
        println("Неверный формат записи")
    }
}



