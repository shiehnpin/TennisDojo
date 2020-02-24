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

}
