fun main() {
    val adversary = JHava()
    println(adversary.utterGreeting())
    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.lowercase() ?: "It's complicated")
}
