package i_introduction._10_Object_Expressions

import java.util.Collections.sort

fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int?, o2: Int?): Int = o2!! - o1!!
    })
    return arrayList
}