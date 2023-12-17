import kotlin.random.Random
import sort_funs.*

fun main() {
    // Ввод количества элементов в массиве
    print("Введите количество элементов в массиве: ")
    val size = readLine()?.toIntOrNull() ?: 0

    if (size <= 0) {
        println("Некорректный ввод. Пожалуйста, введите положительное число.")
        return
    }

    // Генерируем массив из 'size' случайных чисел
    val arrayToSort = IntArray(size) { Random.nextInt(1, 1000) }

    println("Исходный массив: ${arrayToSort.joinToString()}")

    // Создаем копию массива и сортируем ее пузырьковой сортировкой
    val arrayCopy1 = arrayToSort.clone()
    bubbleSort(arrayCopy1)
    println("Отсортированный массив (пузырьковая сортировка): ${arrayCopy1.joinToString()}")

    // Создаем копию массива и сортируем массив шейкерной сортировкой
    val arrayCopy2 = arrayToSort.clone()
    shakerSort(arrayCopy2)
    println("Отсортированный массив (шейкерная сортировка): ${arrayCopy2.joinToString()}")

    // Создаем копию массива и сортируем массив сортировкой расческой
    val arrayCopy3 = arrayToSort.clone()
    combSort(arrayCopy3)
    println("Отсортированный массив (сортировка расческой): ${arrayCopy3.joinToString()}")

    // Создаем копию массива и сортируем массив сортировкой вставками
    val arrayCopy4 = arrayToSort.clone()
    insertionSort(arrayCopy4)
    println("Отсортированный массив (сортировка вставками): ${arrayCopy4.joinToString()}")

    // Создаем копию массива и сортируем массив сортировкой Шелла
    val arrayCopy5 = arrayToSort.clone()
    shellSort(arrayCopy5)
    println("Отсортированный массив (сортировка Шелла): ${arrayCopy5.joinToString()}")
}
