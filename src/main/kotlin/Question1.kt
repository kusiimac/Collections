/**
1. Create a list of 10 integers; 89, 45, 23, 5, 67, 12, 55, 89, 54, 55
   and print them out in ascending order
 */
fun main() {
    val list = listOf<Int>(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)
    val ascList = list.sorted()
    ascList.forEach {
        println(it) }
}