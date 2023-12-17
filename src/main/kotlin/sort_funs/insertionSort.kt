package sort_funs

fun insertionSort(arr: IntArray) {
    val n = arr.size

    for (i in 1 until n) {
        val key = arr[i]
        var j = i - 1

        // Сдвигаем элементы массива, которые больше key, вправо
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }

        // Вставляем key в правильное место
        arr[j + 1] = key
    }
}