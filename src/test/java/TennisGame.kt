class TennisGame(playerAName: String, playerBName: String) {
    fun getResult(playerAScore: Int, playerBScore: Int): String {
        if (playerAScore == playerBScore) {
            return when (playerAScore) {
                0 -> "Love all"
                1 -> "Fifteen all"
                2 -> "Thirty all"
                else -> ""
            }
        }
        if (playerAScore == 1) {
            if (playerBScore == 1) return "Fifteen all"
            else return "Fifteen/Love"
        }
        return "Love all"
    }

}

