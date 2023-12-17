package sort_funs

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