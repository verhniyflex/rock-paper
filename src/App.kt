fun main() {
    val options: Array<String> = arrayOf("Itachi", "Sasuke", "Naruto")
    val userChoice = getUserChoice(options)
    val compChoice = getCompChoice(options)
    printResult(userChoice, compChoice)
}
//

fun getUserChoice(optionsArray: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print(" Choose from:")
        for (item in optionsArray) print(" $item")
        println("")
        val userInput = readLine()?.capitalize()
        if (userInput != null && userInput in optionsArray) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) print("choose other name")
    }
    return userChoice
}
//

fun getCompChoice(optionsList: Array<String>) =
    optionsList[(Math.random() * optionsList.size).toInt()]
//

fun printResult(userChoice: String, compChoice: String) {
    var result: String = ""
    if (userChoice == compChoice) print("Tie!")
    else if ((userChoice == "Naruto" && compChoice == "Sasuke") ||
            (userChoice == "Naruto" && compChoice == "Itachi") ||
            (userChoice == "Sasuke" && compChoice == "Itachi")) result = "You win"
            else result = "you lose"
    println("You choose $userChoice i choose $compChoice. $result")
}