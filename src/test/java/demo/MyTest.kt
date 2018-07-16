package demo

import org.jmock.AbstractExpectations.returnValue
import org.jmock.Expectations
import org.jmock.Mockery
import org.jmock.integration.junit4.JUnitRuleMockery
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MyTest{


    @Rule
    @JvmField
    val context: JUnitRuleMockery = JUnitRuleMockery()

    private fun Mockery.expecting(block: Expectations.() -> Unit){
        this.checking(Expectations().apply(block))
    }

    val human: Human = context.mock(Human::class.java)

    @Before
    fun setUp(){
        println("This runs before all tests")
    }

    @Test
    fun shouldLive(){

        context.expecting {
            oneOf(human).live()
            will(returnValue(1))
        }

        assert(makeMeLive(human) == 1)
    }


    @Test
    fun shouldLiveFiveTimes(){

        context.expecting {
            exactly(5).of(human).live()
            will(returnValue(1))
        }

        for (i in 1 until 5 step 1) assert(makeMeLive(human) == 1)
    }

}

fun makeMeLive(human: Human) : Int {
    return human.live()
}

interface Human{
    fun live() : Int
}