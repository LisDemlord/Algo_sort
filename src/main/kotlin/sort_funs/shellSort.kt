package sort_funs

fun shellSort(arr: IntArray) {
    val n = arr.size

    // Выбираем интервал
    var interval = 1
    while (interval < n / 3) {
        interval = interval * 3 + 1
    }

    while (interval > 0) {
        for (i in interval until n) {
            val key = arr[i]
            var j = i

            // Сдвигаем элементы массива, которые больше key, вправо
            while (j > interval - 1 && arr[j - interval] > key) {
                arr[j] = arr[j - interval]
                j -= interval
            }

            // Вставляем key в правильное место
            arr[j] = key
        }

        interval = interval / 3
    }
}