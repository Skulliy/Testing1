package Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class testwater {
    @Test
    public void test1(){

        assertTrue(Watermelon.isdivisible(16) == "YES");
    }
    @Test
    public void test4(){

        assertTrue(Watermelon.isdivisible(7) == "NO");
    }
}
