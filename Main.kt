//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    var hrn: Int
    var money: String

    while (true) {
        println("Введіть суму в гривнях")
        hrn = readLine()!!.toInt()

        if (hrn <= 0) {
            println("Шо ти зібрався міняти???")
            continue
        }

        println("Введіть бажану валюту де 1=USD 2=EUR 3=PLN 4=вихід")
        money = readLine()!!

        when (money) {
            "1" -> println(Math.round((hrn / 43.0) * 100) / 100.0)
            "2" -> println(Math.round((hrn / 48.0) * 100) / 100.0)
            "3" -> println(Math.round((hrn / 12.0) * 100) / 100.0)
            "4" -> System.exit(0)
            else -> println("Такої валюти не існує")
        }
}



    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }

