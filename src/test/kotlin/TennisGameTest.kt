import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TennisGameTest{

    @Test
    fun test_0_to_0(){
        assertEquals(
            TennisGame("Foo","bar",0,0)
                .getResult()
            ,"Love All");
    }

    @Test
    fun test_1_to_0(){
        assertEquals(
            TennisGame("Foo","bar",1,0)
                .getResult(),"Fifteen/Love");
    }

    @Test
    fun test_2_to_0(){
        assertEquals(
            TennisGame("Foo","bar",2,0)
                .getResult(),"Thirty/Love");
    }

    @Test
    fun test_3_to_0(){
        assertEquals(
            TennisGame("Foo","bar",3,0)
                .getResult(),"Forty/Love");
    }


    @Test
    fun test_4_to_0(){
        assertEquals(
            TennisGame("Foo","bar",4,0)
                .getResult(),"Foo Win");
    }

    @Test
    fun test_fooo_4_to_0(){
        assertEquals(
            TennisGame("Fooo","bar",4,0)
                .getResult(),"Fooo Win");
    }

    @Test
    fun test_foo_0_to_1(){
        assertEquals(
            TennisGame("Foo","bar",0,1)
                .getResult(),"Love/Fifteen");
    }

    @Test
    fun test_foo_0_to_2(){
        assertEquals(
            TennisGame("Foo","bar",0,2)
                .getResult(),"Love/Thirty");
    }

    @Test
    fun test_foo_0_to_3(){
        assertEquals(
            TennisGame("Foo","bar",0,3)
                .getResult(),"Love/Forty");
    }

    @Test
    fun test_foo_0_to_4(){
        assertEquals(
            TennisGame("Foo","bar",0,4)
                .getResult(),"bar Win");
    }

    @Test
    fun test_foo_2_to_2(){
        assertEquals(
            TennisGame("Foo","bar",2,2)
                .getResult(),"Thirty All");
    }

    @Test
    fun test_foo_3_to_3(){
        assertEquals(
            TennisGame("Foo","bar",3,3)
                .getResult(),"Deuce");
    }

    @Test
    fun test_foo_4_to_5(){
        assertEquals(
            TennisGame("Foo","bar",4,5)
                .getResult(),"Advantage, bar");
    }

    @Test
    fun test_foo_5_to_4(){
        assertEquals(
            TennisGame("Foo","bar",5,4)
                .getResult(),"Advantage, Foo");
    }

    @Test
    fun test_foo_6_to_4(){
        assertEquals(
            TennisGame("Foo","bar",6,4)
                .getResult(),"Foo Win");
    }

    @Test
    fun test_foo_4_to_6(){
        assertEquals(
            TennisGame("Foo","bar",4,6)
                .getResult(),"bar Win");
    }

    @Test
    fun test_foo_4_to_2(){
        assertEquals(
            TennisGame("Foo","bar",4,2)
                .getResult(),"Foo Win");
    }
}