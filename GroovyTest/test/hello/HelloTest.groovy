package hello

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*
import groovy.util.logging.Log
import java.util.logging.Level

@Log
class HelloTest {
    
    @Test
    def void greet() {
        def hello = new Hello()
        hello.name = "Test"
        assertTrue "Hello, Test" == hello.greet()
    }

    @Test
    def void greetFromFile() {
        def hello = new Hello()
        hello.name = new File("c:/Users/martinellisi/temp/data.txt").text
        assertTrue "Hello, Data File" == hello.greet()
    }

    @Test
    def void checkImmutable() {
        try {
            def helloImmutable = new HelloImmutable("Test")
            hello.name = "No allowed"
            fail
        }
        catch (ex) {
            log.log(Level.SEVERE, ex.message, ex)
        }
    }
}
