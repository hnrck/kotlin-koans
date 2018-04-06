package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun todoTask4(collection: Collection<Int>): Boolean = collection.any {it % 2 == 0}

fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)