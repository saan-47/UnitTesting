package unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiTest {

    @Test
    void test1() {
        UnitTesting test =new UnitTesting();
        double output=test.multi(0, 0);
        assertEquals(0, output);
    }
    @Test
    void test2() {
        UnitTesting test =new UnitTesting();
        double output=test.multi(-1, 0);
        assertEquals(0, output);
    }
    @Test
    void test3() {
        UnitTesting test =new UnitTesting();
        double output=test.multi(-3, -3);
        assertEquals(9, output);
    }
    @Test
    void test4() {
        UnitTesting test =new UnitTesting();
        double output=test.multi(3, -3);
        assertEquals(-9, output);
    }

}