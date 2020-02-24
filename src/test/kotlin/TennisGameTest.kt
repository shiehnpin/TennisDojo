import org.junit.Assert
import org.junit.Test

class TennisGameTest{

    @Test
    fun `all_player_0`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(0, 0)
        Assert.assertEquals("Love all", actual)
    }

    @Test
    fun `Fifteen vs love`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(1, 0)
        Assert.assertEquals("Fifteen/Love", actual)
    }

    @Test
    fun `Fifteen_all`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(1, 1)
        Assert.assertEquals("Fifteen all", actual)
    }

    @Test
    fun `Thirty_all`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(2, 2)
        Assert.assertEquals("Thirty all", actual)
    }

    @Test
    fun `Fifteen vs Forty`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(1, 3)
        Assert.assertEquals("Fifteen/Forty", actual)
    }


    @Test
    fun `Deuce`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(3, 3)
        Assert.assertEquals("Deuce", actual)
    }

    @Test
    fun `Foo_win_4_1`() {
        val tennisGame = TennisGame("Foo", "Bar")
        val actual: Any = tennisGame.getResult(4, 1)
        Assert.assertEquals("Foo win", actual)
    }


}
