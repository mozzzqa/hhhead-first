class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape PLAYING")
    }

    fun recordTape() {
        if (hasRecorder) {
            println("Tape RECORDing")
        }
    }
}

fun main() {
    val t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}