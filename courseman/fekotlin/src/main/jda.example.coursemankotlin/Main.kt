import jda.mosa.controller.Controller

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // Test jda import
    var ctrlName = Controller::class.simpleName
    println("JDA import: ${ctrlName}")
}