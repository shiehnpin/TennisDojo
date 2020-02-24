class TennisGame(val playerAName: String, val playerBName: String) {
    fun getResult(playerAScore: Int, playerBScore: Int): String = when {
        playerAScore == playerBScore -> when (playerAScore) {
            3 -> "Deuce"
            else -> "${scoreMap[playerAScore]} all"
        }
        //Deuce case
        playerAScore + playerBScore == 7 -> if (playerAScore > playerBScore) {
            "Advantage, $playerAName"
        } else {
            "Advantage, $playerBName"
        }
        playerAScore in 4..5 -> "$playerAName win"
        playerBScore in 4..5 -> "$playerBName win"
        else -> "${scoreMap[playerAScore]}/${scoreMap[playerBScore]}"
    }

}

val scoreMap = mapOf(
    0 to "Love",
    1 to "Fifteen",
    2 to "Thirty",
    3 to "Forty"
)

