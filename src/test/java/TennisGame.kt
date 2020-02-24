class TennisGame(val playerAName: String, val playerBName: String) {
    fun getResult(playerAScore: Score, playerBScore: Score): String {
        if (playerAScore == playerBScore) {
            return when (playerAScore) {
                Score.LOVE -> "Love all"
                Score.FIFTEEN -> "Fifteen all"
                Score.THIRTY -> "Thirty all"
                Score.FORTY -> "Deuce"
                else -> ""
            }
        } else if (playerAScore == Score.WIN) {
            return "$playerAName win"
        } else {
            return "${playerAScore.msg}/${playerBScore.msg}"
        }
    }

}

enum class Score(val score: Int, val msg: String) {
    LOVE(0, "Love"),
    FIFTEEN(1, "Fifteen"),
    THIRTY(2, "Thirty"),
    FORTY(3, "Forty"),

    WIN(4, "???")
}

