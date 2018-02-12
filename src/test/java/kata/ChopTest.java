package kata;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static org.junit.Assert.*;

public class ChopTest {

    Chop chop = new Chop();

    @Test
    public void chop() {
        assertEquals(-1, chop.chop(3, emptyList()));
        assertEquals(-1, chop.chop(3, singletonList(1)));
        assertEquals(0, chop.chop(1, singletonList(1)));

        assertEquals(0,  chop.chop(1, asList(1, 3, 5)));
        assertEquals(1,  chop.chop(3, asList(1, 3, 5)));
        assertEquals(2,  chop.chop(5, asList(1, 3, 5)));
        assertEquals(-1, chop.chop(0, asList(1, 3, 5)));
        assertEquals(-1, chop.chop(2, asList(1, 3, 5)));
        assertEquals(-1, chop.chop(4, asList(1, 3, 5)));
        assertEquals(-1, chop.chop(6, asList(1, 3, 5)));

        assertEquals(0,  chop.chop(1, asList(1, 3, 5, 7)));
        assertEquals(1,  chop.chop(3, asList(1, 3, 5, 7)));
        assertEquals(2,  chop.chop(5, asList(1, 3, 5, 7)));
        assertEquals(3,  chop.chop(7, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chop(0, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chop(2, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chop(4, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chop(6, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chop(8, asList(1, 3, 5, 7)));
    }

    @Test
    public void chopWithJava8Streams() {
        assertEquals(-1, chop.chopJava8Streams(3, emptyList()));
        assertEquals(-1, chop.chopJava8Streams(3, singletonList(1)));
        assertEquals(0, chop.chopJava8Streams(1, singletonList(1)));

        assertEquals(0,  chop.chopJava8Streams(1, asList(1, 3, 5)));
        assertEquals(1,  chop.chopJava8Streams(3, asList(1, 3, 5)));
        assertEquals(2,  chop.chopJava8Streams(5, asList(1, 3, 5)));
        assertEquals(-1, chop.chopJava8Streams(0, asList(1, 3, 5)));
        assertEquals(-1, chop.chopJava8Streams(2, asList(1, 3, 5)));
        assertEquals(-1, chop.chopJava8Streams(4, asList(1, 3, 5)));
        assertEquals(-1, chop.chopJava8Streams(6, asList(1, 3, 5)));

        assertEquals(0,  chop.chopJava8Streams(1, asList(1, 3, 5, 7)));
        assertEquals(1,  chop.chopJava8Streams(3, asList(1, 3, 5, 7)));
        assertEquals(2,  chop.chopJava8Streams(5, asList(1, 3, 5, 7)));
        assertEquals(3,  chop.chopJava8Streams(7, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chopJava8Streams(0, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chopJava8Streams(2, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chopJava8Streams(4, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chopJava8Streams(6, asList(1, 3, 5, 7)));
        assertEquals(-1, chop.chopJava8Streams(8, asList(1, 3, 5, 7)));
    }
}