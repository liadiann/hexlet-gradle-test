package hexlet.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomeClassTest {
    @Test
    public void testSum() {
        var expected = 4;
        var actual = SomeClass.sum(3, 1);
        assertEquals(expected, actual);
    }
}
