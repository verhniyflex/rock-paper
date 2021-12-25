fun main() {
    val test: String = "Yes"
    try {
        print("t")
        print("h")
        riskyCode(test)
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
        print("s")
    }
}

class BadException : Exception()

    fun riskyCode(test: String) {
        if (test == "Yes") {
            throw BadException()
        }
        print("r")
    }




















