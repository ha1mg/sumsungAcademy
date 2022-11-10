fun String.countVowels():Int {
    var count = 0
    for (char in this) {
        if (char in "aeiou") {
            count++
        }
    }
    return count
}


fun main() {
    val phrase = "I'm here to see you"
    println(phrase.countVowels())
    val greeting = "Welcome  to Neverland! Be our guest."
    println(greeting.countVowels())
}