package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import util.TODO
import util.doc2

fun todoTask2(collection: Collection<Int>): String = collection.joinToString(prefix = "{", postfix = "}")

fun task2(collection: Collection<Int>): String {
    return todoTask2(collection)
}