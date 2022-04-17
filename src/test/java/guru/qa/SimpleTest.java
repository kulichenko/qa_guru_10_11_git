package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    void test(){
        Assertions.assertTrue(3>2);
    }

    @Test
    void test1(){
        Assertions.assertFalse(3>2);
    }

    @Test
    void test2(){
        Assertions.assertFalse(1>2);
    }

    @Test
    void test3(){
        Assertions.assertFalse(1>0);
    }
}
