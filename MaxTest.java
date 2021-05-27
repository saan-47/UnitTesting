package unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @org.junit.jupiter.api.Test
    void test1() {
        UnitTesting test =new UnitTesting();
        double output=test.max(5, 3);
        assertEquals(5, output);
    }
    @Test
    void test2() {
        UnitTesting test =new UnitTesting();
        double output=test.max(0, 0);
        assertEquals(0, output);
    }
    @Test
    void test3() {
        UnitTesting test =new UnitTesting();
        double output=test.max(3, 6);
        assertEquals(6, output);
    }
    @Test
    void test4() {
        UnitTesting test =new UnitTesting();
        double output=test.max(-3, 3);
        assertEquals(3, output);
    }

}