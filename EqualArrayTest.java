package unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualArrayTest {

    @Test
    void test1() {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        int[] ar1 = {1,2,3,4,5,6,7,8,10};
        UnitTesting test =new UnitTesting();
        int output=test.areArrayEqual(ar,ar1);
        assertEquals(0, output);
    }
    @Test
    void test2() {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        int[] ar1 = {1,2,3,4,5,6,7};
        UnitTesting test =new UnitTesting();
        int output=test.areArrayEqual(ar,ar1);
        assertEquals(1, output);
    }
    @Test
    void test3() {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        int[] ar1 = {1,2,3,4,5,6,7,8,11};
        UnitTesting test =new UnitTesting();
        int output=test.areArrayEqual(ar,ar1);
        assertEquals(1, output);
    }
    @Test
    void test() {
        int[] ar = {1,2,3,4,5,6,7,8,10};
        int[] ar1 = {};
        UnitTesting test =new UnitTesting();
        int output=test.areArrayEqual(ar,ar1);
        assertEquals(1, output);
    }

}