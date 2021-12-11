class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Song("Oversized", "Basement")
    val songTwo = Song("505", "Arctic Monkeys")
    val songThree = Song("Creep", "Radiohead")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}

