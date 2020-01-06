
class TennisGame(val playerA: String,val playerB: String,val scoreA: Int,val scoreB: Int) {
    private fun Int.toText(): String {
        return when(this){
            0 -> "Love"
            1 -> "Fifteen"
            2 -> "Thirty"
            3 -> "Forty"
            else -> throw Exception("unknown score")
        }
    }

    fun getResult(): String {
        if(scoreA == scoreB){
            if(scoreA == 3) {
                return "Deuce"
            }
            return "${scoreA.toText()} All"
        }else if(scoreA!=4 && scoreB!=4) {
            return "${scoreA.toText()}/${scoreB.toText()}"
        }else if(scoreA == 4){
            if(scoreB == 5) {
                return "Advantage, $playerB"
            }else if(scoreB == 6) {
                return "$playerB Win"
            }
            return "$playerA Win"
        }else if(scoreB == 4){
            if(scoreA == 5) {
                return "Advantage, $playerA"
            }else if(scoreA == 6) {
                return "$playerA Win"
            }
            return "$playerB Win"
        }
        throw Exception("unknown result")
    }

}

