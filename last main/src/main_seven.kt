fun main() {
    FFFF()
}

fun FFFF():Int {
    val args = arrayOf(0,1,2)
    var max = args[0]
    var x = 1
    while (x <= args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}