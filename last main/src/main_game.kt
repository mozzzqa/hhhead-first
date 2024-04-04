fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл пока юзер не введет доступную игру
    while (!isValidChoice) {
        //Запрашиваем данные юзером
        print("Пж введите одно из значений:")
        for (item in optionsParam) print(" $item")
        println(":")
        //Прочитать юзерский ввод
        val userInput = readLine()
        //Проверка юзерского ввода
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Сообщить если юзер ввел недопустимуюи игру
        if (!isValidChoice) println("Введи доппустимую игру!")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    var result: String
    //Do result
    if (userChoice == gameChoice) result = "НИЧЬЯ!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")) result = "WIN!!!!"
    else result = "LOOOOSE!"
    //end
    println("Твой выбор $userChoice. Игра выбрала $gameChoice. $result")
}