class TennisGame(playerAName: String, playerBName: String) {
    fun getResult(playerAScore: Score, playerBScore: Score): String {
        if (playerAScore == playerBScore) {
            return when (playerAScore) {
                Score.LOVE -> "Love all"
                Score.FIFTEEN -> "Fifteen all"
                Score.THIRTY -> "Thirty all"
            }
        }
        if (playerAScore == Score.FIFTEEN) {
            if (playerBScore == Score.FIFTEEN) return "Fifteen all"
            else return "Fifteen/Love"
        }
        return "Love all"
    }

}

enum class Score(val score: Int, val msg: String) {
    LOVE(0, "Love"),
    FIFTEEN(1, "Fifteen"),
    THIRTY(2, "Thirty")
}

