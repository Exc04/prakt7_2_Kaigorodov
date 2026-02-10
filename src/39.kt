import java.lang.NumberFormatException
import kotlin.math.sqrt

fun main()
{
    try {
        print("Введите k: ")
        var k = readln()!!.toDouble()

        print("Введите b: ")
        var b = readln()!!.toDouble()

        print("Введите c: ")
        var c = readln()!!.toDouble()

        print("Введите d: ")
        var d = readln()!!.toDouble()

        print("Введите e: ")
        var e = readln()!!.toDouble()


        var A = c
        var B = d - k
        var C = e - b

        var D = B * B - 4 * A * C

        println("\nПрямая: y = ${k}x + $b")
        println("Парабола: y = ${c}x² + ${d}x + $e")

        when {
            D > 0 -> {
                var x1 = (-B + sqrt(D)) / (2 * A)
                var x2 = (-B - sqrt(D)) / (2 * A)
                var y1 = k * x1 + b
                var y2 = k * x2 + b

                println("\nДве точки пересечения:")
                println("1. (${"%.2f".format(x1)}, ${"%.2f".format(y1)}) - расстояние: ${"%.2f".format(sqrt(x1*x1 + y1*y1))}")
                println("2. (${"%.2f".format(x2)}, ${"%.2f".format(y2)}) - расстояние: ${"%.2f".format(sqrt(x2*x2 + y2*y2))}")
            }
            D == 0.0 -> {
                var x = -B / (2 * A)
                var y = k * x + b

                println("\nОдна точка пересечения (касание):")
                println("(${"%.2f".format(x)}, ${"%.2f".format(y)}) - расстояние: ${"%.2f".format(sqrt(x*x + y*y))}")
            }
            else -> println("\nНет точек пересечения")
        }




    }
    catch(e:NumberFormatException)
    {
        println("Неверный формат записи")
    }
}


