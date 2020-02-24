class TennisGame(val playerAName: String, val playerBName: String) {
    fun getResult(playerAScore: Int, playerBScore: Int): String {
        if (playerAScore == playerBScore) {
            return when (playerAScore) {
                4 -> "Deuce"
                else -> "${scoreMap[playerAScore]} all"
            }
        } else if (playerAScore == 4) {
            return "$playerAName win"
        } else {
            return "${scoreMap[playerAScore]}/${scoreMap[playerBScore]}"
        }
    }

}

val scoreMap = hashMapOf(
    Pair(0, "Love"),
    Pair(1, "Fifteen"),
    Pair(2, "Thirty"),
    Pair(3, "Forty")
)

enum class Score(val score: Int) {
    Love(0),
    Fifteen(1),
    Thirty(2),
    Forty(3),
}

