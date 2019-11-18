import java.util.*


fun main(args: Array<String>) {
    var userSteps = 0
    var stepLimit: Int
    val random = SplittableRandom()
    val reader = Scanner(System.`in`)
    val number = random.nextInt(0, 100)
    var difficulty: Int
    var userGuess: Int

    loop@ while (true) {

        println("Please select a difficulty level. 1- Easy, 2- Medium, 3- Hard.")
        difficulty = reader.nextInt()


        when (difficulty) {
            1 -> {
                println("Enter a number between 1 and 100")
                stepLimit = 7 - userSteps
                while (stepLimit != 0) {
                    println("You have $stepLimit steps. What's your guess? ")
                    userGuess = reader.nextInt()
                    userSteps++
                    if (userGuess > number) println("Take lower number !")
                    else if (userGuess < number) println("Take higher number!")
                    else if (userGuess == number) {
                        println("Congradulations!!! You won!!!")
                        stepLimit == 0
                        return
                    }
                    stepLimit--
                }
                if(stepLimit==0) {
                    println("The game is restarted, choose difficulty")
                    userSteps==0
                    continue@loop
                }
            }
            2 -> {
                println("Enter a number between 1 and 100")
                stepLimit = 5 - userSteps
                while (stepLimit != 0) {
                    println("You have $stepLimit steps. What's your guess? ")
                    userGuess = reader.nextInt()
                    userSteps++
                    if (userGuess > number) println("Take lower number !")
                    else if (userGuess < number) println("Take higher number!")
                    else if (userGuess == number) {
                        println("Congradulations!!! You won!!!")
                        stepLimit == 0
                        return
                    }
                    stepLimit--
                }
                if(stepLimit==0) {
                    println("The game is restarted, choose difficulty")
                    userSteps==0
                    continue@loop
                }
            }
            3 -> {
                println("Enter a number between 1 and 100")
                stepLimit = 3 - userSteps
                while (stepLimit != 0) {
                    println("You have $stepLimit steps. What's your guess? ")
                    userGuess = reader.nextInt()
                    userSteps++
                    if (userGuess > number) println("Take lower number !")
                    else if (userGuess < number) println("Take higher number!")
                    else if (userGuess == number) {
                        println("Congradulations!!! You won!!!")
                        stepLimit == 0
                        return
                    }
                    stepLimit--
                }
                if(stepLimit==0) {
                    println("The game is restarted, choose difficulty")
                    userSteps==0
                    continue@loop
                }
            }
            else -> print("Wrong choose,please enter the correct number!!!")
        }
    }
}