fun main(args: Array<String>) {
    //Домашнее задание: программа расчета объёма куба

    println("Введите значение первой стороны куба:")
    val side1 = readln()   //Присвоение значения первой стороне куба
    println("Введите значение второй стороны куба:")
    val side2 = readln()   //Присвоение значения второй стороне куба
    println("Введите значение третьей стороны куба:")
    val side3 = readln()   //Присвоение значения третьей стороне куба
    val volume = side1.toInt() * side2.toInt() * side3.toInt()   //Расчет значения объема куба
    println("Объем куба равен:")
    println(volume)
}