package i_introduction._6_Data_Classes

import util.TODO
import util.doc6

data class Person(val name: String, val age: Int)

fun todoTask6(): List<Person> = listOf(Person("Alice", 29), Person("Bob", 31))

fun task6(): List<Person> {
    return todoTask6()
}
