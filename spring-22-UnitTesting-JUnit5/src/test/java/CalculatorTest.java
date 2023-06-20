import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
    }


    @BeforeAll
    static void beforeAll(){
        System.out.println("Method Executed Before Test Cases -> using @BeforeEach annotation");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Method Executed After Test Cases -> using @AfterEach annotation");
    }

//----------------------------------------------------------------------------------------------------------------------

    @Test //    Assert Equals where Test == Expected Result {PASS}
    void testCase1(){
        System.out.println("Test Case 1");
        int actual = Calculator.add(1,1);
        assertEquals(2, actual, "FAILURE!!");
    }


    @Test //    Assert Equals where Test Does NOT == Expected Result {FAIL}
    void testCase2(){
        System.out.println("Test Case 2");
        int actual = Calculator.add(1,1);
        assertEquals(4, actual, "FAILURE!!");
    }

    @Test
    void testCase3(){
        System.out.println("Test Case 3");
    }

    @Test
    void testCase4(){
        System.out.println("Test Case 4");
//        fail("FAILURE!");
    }


}