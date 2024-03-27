//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var x: Byte = 101
    var y = 0
    while (x < 120) {
        if (y < 5) {
            x = (x + 1).toByte()
            if (y < 3) x = (x - 1).toByte()
        }
        y = y + 3
        print("$x$y ")
        x = (x + 1).toByte()
    }
}