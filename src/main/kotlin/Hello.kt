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
}
