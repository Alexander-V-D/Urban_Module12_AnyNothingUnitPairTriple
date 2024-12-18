fun main() {
    //Задача 1
    println("Пример выполнения решения задачи 1: " + checkSymmetry("{([])}"))

    //Задача 2
    val array = intArrayOf(1, 2, 3)
    val list = array.toMutableList()
    val reversedList = list.reversed().toMutableList()
    println("Выполнение решения для задачи 2:")
    for (i in list.indices) {
        println(list)
        list.addFirst(list.last())
        list.removeLast()
    }
    for (i in reversedList.indices) {
        println(reversedList)
        reversedList.addFirst(reversedList.last())
        reversedList.removeLast()
    }
}

//Функции для задачи 1
fun checkSymmetry(string: String): Boolean {
    val firstHalf = string.dropLast(string.length / 2).toCharArray()
    val reversedSecondHalf = string.drop(string.length / 2).reversed().toCharArray()
    for (index in firstHalf.indices) {
        if (firstHalf[index] != reverseChar(reversedSecondHalf[index])) return false
    }
    return true
}

fun reverseChar(char: Char): Char {
    return when(char) {
        '{' -> '}'
        '[' -> ']'
        '(' -> ')'
        '<' -> '>'
        '}' -> '{'
        ']' -> '['
        ')' -> '('
        '>' -> '<'
        else -> char
    }
}