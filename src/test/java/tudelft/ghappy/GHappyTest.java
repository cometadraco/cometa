package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class GHappyTest {

    private final GHappy gHappy = new GHappy();

    @Test
    public void testGHappy1() {
        assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    public void testGHappy2() {
        assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void testGHappy3() {
        assertFalse(gHappy.gHappy("xxggyygxx"));
    }

    @Test
    public void testGHappy4() {
        assertTrue(gHappy.gHappy("gggg"));
    }

    @Test
    public void testGHappy5() {
        assertTrue(gHappy.gHappy("g"));
    }

    @Test
    public void testGHappy6() {
        assertTrue(gHappy.gHappy(""));
    }

}
