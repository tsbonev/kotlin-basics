package demo

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyTest{

    @Test
    fun test(){
        assert(true)
    }

}