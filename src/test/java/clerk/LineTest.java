package clerk;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    @Test
    public void test0() {
        assertEquals("YES", Line.Tickets(new int[]{25}));
    }

    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int[]{25, 100}));
    }

    @Test
    public void test3() {
        assertEquals("NO", Line.Tickets(new int[]{25, 25, 50, 50, 100, 100}));
    }

    @Test
    public void test4() {
        assertEquals("NO", Line.Tickets(new int[]{25, 25, 25, 100, 25, 25, 25, 100, 25, 50, 25, 100, 50, 50}));
    }
}