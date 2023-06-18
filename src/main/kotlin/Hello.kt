@file:JvmName("Hello")

fun main() {
    val adversary = JHava()
    println(adversary.utterGreeting())
    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.lowercase() ?: "It's complicated")
    val hitPoints = adversary.hitPoints
    println("Hit points: $hitPoints")
    println(hitPoints.javaClass)
    println(hitPoints::class)
    println("String"::class)
    adversary.greeting = "Foo Greeting"
    println(adversary.utterGreeting())
    adversary.offerFood()
}

fun makeProclamation() = "Greetings, beast!"

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    println("Mmmmmm.... you hand over some delicious $leftHand and $rightHand.")
}

class Spellbook {
    @JvmField
    val spells = listOf("Magic Ms. L", "Lay on Hans")
}
