package sort_funs

fun combSort(arr: IntArray) {
    val n = arr.size
    var gap = n
    var swapped: Boolean

    do {
        // Вычисляем новый gap
        gap = (gap * 10 / 13).coerceAtLeast(1)

        swapped = false

        // Сравниваем элементы с текущим gap
        for (i in 0 until n - gap) {
            if (arr[i] > arr[i + gap]) {
                // меняем элементы местами, если текущий больше следующего
                val temp = arr[i]
                arr[i] = arr[i + gap]
                arr[i + gap] = temp
                swapped = true
            }
        }
    } while (gap > 1 || swapped)
}