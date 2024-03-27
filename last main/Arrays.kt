fun main() {

    val fruits = arrayOf("Eba","Banana","Blueberry","Pomegranate","Cherry")
    val index = arrayOf(1,4,2,3)
    var x = 0
    var count: Int

    while (x < 4) {
        count = index[x]
        println("Fruit = ${fruits[count]}")
        x = x + 1
    }
}
