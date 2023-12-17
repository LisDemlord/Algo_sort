import kotlin.random.Random
import sort_funs.*

fun main() {
    // Генерируем массив из 100 случайных чисел
    val arrayToSort = IntArray(10) { Random.nextInt(1, 1000) }

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
}
