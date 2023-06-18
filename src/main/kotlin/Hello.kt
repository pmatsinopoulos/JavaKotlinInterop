@file:JvmName("Hello")

import java.io.IOException

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
    try {
        adversary.extendHandInFriendship()
    } catch (e: Exception) {
        println("Begone, foul beast!")
    }
}

fun makeProclamation() = "Greetings, beast!"

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    println("Mmmmmm.... you hand over some delicious $leftHand and $rightHand.")
}

@Throws(IOException::class)
fun acceptApology() {
    throw IOException()
}

class Spellbook {
    @JvmField
    val spells = listOf("Magic Ms. L", "Lay on Hans")

    companion object {
        @JvmField
        val MAX_SPELL_COUNT = 10

        @JvmStatic
        fun getSpellbookGreeting() = println("I am the Great Grimoire!")
    }
}

val translator = { utterance: String ->
    println(utterance.lowercase().capitalize())
}
