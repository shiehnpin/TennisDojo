class TennisGame(playerAName: String, playerBName: String) {
    fun getResult(playerAScore: Int, playerBScore: Int): String {
        if (playerAScore == 1) {
            return "Fifteen/Love"
        }
        return "Love all"
    }

}
