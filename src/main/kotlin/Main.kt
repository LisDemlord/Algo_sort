import kotlin.random.Random

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    var temp: Int

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // меняем элементы местами, если текущий больше следующего
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    // Генерируем массив из 100 случайных чисел
    val arrayToSort = IntArray(50) { Random.nextInt(1, 1000) }

    println("Исходный массив: ${arrayToSort.joinToString()}")

    // Вызываем функцию сортировки
    bubbleSort(arrayToSort)

    println("Отсортированный массив: ${arrayToSort.joinToString()}")
}
