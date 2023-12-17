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

fun shakerSort(arr: IntArray) {
    val n = arr.size
    var swapped: Boolean
    var start = 0
    var end = n - 1

    do {
        swapped = false

        // Проход слева направо
        for (i in start until end) {
            if (arr[i] > arr[i + 1]) {
                // меняем элементы местами, если текущий больше следующего
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                swapped = true
            }
        }

        if (!swapped) break

        swapped = false
        end--

        // Проход справа налево
        for (i in end - 1 downTo start) {
            if (arr[i] > arr[i + 1]) {
                // меняем элементы местами, если текущий больше следующего
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                swapped = true
            }
        }

        start++
    } while (swapped)
}

fun main() {
    // Генерируем массив из 100 случайных чисел
    val arrayToSort = IntArray(10) { Random.nextInt(1, 1000) }

    println("Исходный массив: ${arrayToSort.joinToString()}")

    // Создаем копию массива и сортируем ее пузырьковой сортировкой
    val arrayCopy = arrayToSort.clone()
    bubbleSort(arrayCopy)
    println("Отсортированный массив (пузырьковая сортировка): ${arrayCopy.joinToString()}")

    // Сортируем исходный массив шейкерной сортировкой
    shakerSort(arrayToSort)
    println("Отсортированный массив (шейкерная сортировка): ${arrayToSort.joinToString()}")
}
