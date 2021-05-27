package unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExistTest {
    @Test
    void test1() {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        UnitTesting test =new UnitTesting();
        int output=test.existInArray(ar,10);
        assertEquals(8, output);
    }
    @Test
    void test2() {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        UnitTesting test =new UnitTesting();
        int output=test.existInArray(ar,9);
        assertEquals(-1, output);
    }
    @Test
    void test3() {
        int[] ar = {};
        UnitTesting test =new UnitTesting();
        int output=test.existInArray(ar,9);
        assertEquals(-1, output);
    }

}