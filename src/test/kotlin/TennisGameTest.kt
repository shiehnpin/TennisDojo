import org.junit.Assert
import org.junit.Test

class TennisGameTest{

    @Test
    fun `all_player_0`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.LOVE, Score.LOVE)
        Assert.assertEquals("Love all", actual)
    }

    @Test
    fun `Fifteen vs love`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.FIFTEEN, Score.LOVE)
        Assert.assertEquals("Fifteen/Love", actual)
    }

    @Test
    fun `Fifteen_all`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.FIFTEEN, Score.FIFTEEN)
        Assert.assertEquals("Fifteen all", actual)
    }

    @Test
    fun `Thirty_all`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.THIRTY, Score.THIRTY)
        Assert.assertEquals("Thirty all", actual)
    }

    @Test
    fun `Fifteen vs Forty`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.FIFTEEN, Score.FORTY)
        Assert.assertEquals("Fifteen/Forty", actual)
    }


    @Test
    fun `Deuce`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.FORTY, Score.FORTY)
        Assert.assertEquals("Deuce", actual)
    }

    @Test
    fun `Foo_win_4_1`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(Score.WIN, Score.FIFTEEN)
        Assert.assertEquals("Foo win", actual)
    }


}
