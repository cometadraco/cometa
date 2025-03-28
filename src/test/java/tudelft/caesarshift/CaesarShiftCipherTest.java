package tudelft.caesarshift;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarShiftCipherTest {

    private final CaesarShiftCipher cipher = new CaesarShiftCipher();

    @Test
    public void testShiftPositive() {
        assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void testShiftNegative() {
        assertEquals("abc", cipher.CaesarShiftCipher("def", -3));
    }

    @Test
    public void testShiftWrapAround() {
        assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
    }

    @Test
    public void testShiftSpace() {
        assertEquals("a b c", cipher.CaesarShiftCipher("x y z", 3));
    }

    @Test
    public void testInvalidCharacter() {
        assertEquals("invalid", cipher.CaesarShiftCipher("abc123", 3));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", cipher.CaesarShiftCipher("", 3));
    }

    @Test
    public void testShiftLargeNumber() {
        assertEquals("def", cipher.CaesarShiftCipher("abc", 29));  // 29 % 26 = 3
    }
}
