import java.lang.NumberFormatException

fun main()
{
    try {
        print("Введите a: ")
        var a = readln()!!.toDouble()

        print("Введите b: ")
        var b = readln()!!.toDouble()

        print("Введите c: ")
        var c = readln()!!.toDouble()

        println("В порядке убывания:")

        var absA = Math.abs(a)
        var absB = Math.abs(b)
        var absC = Math.abs(c)

        when {
            absA >= absB && absA >= absC -> {
                println(a)
                when {
                    absB >= absC -> {
                        println(b)
                        println(c)
                    }
                    else -> {
                        println(c)
                        println(b)
                    }
                }
            }
            absB >= absA && absB >= absC -> {
                println(b)
                when {
                    absA >= absC -> {
                        println(a)
                        println(c)
                    }
                    else -> {
                        println(c)
                        println(a)
                    }
                }
            }
            else -> {
                println(c)
                when {
                    absA >= absB -> {
                        println(a)
                        println(b)
                    }
                    else -> {
                        println(b)
                        println(a)
                    }
                }
            }
        }



    }
    catch(e:NumberFormatException)
    {
        println("Неверный формат записи")
    }
}


