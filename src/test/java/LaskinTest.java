import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaskinTest {
    Laskin laskin;

    @BeforeEach
    void setUp() {
        laskin = new Laskin();
    }

    @Test
    void sum() {
        assertEquals(5, laskin.sum(2, 3));
    }

    @Test
    void sub() {
        assertEquals(-1, laskin.sub(2, 3));
    }

    @Test
    void mul() {
        assertEquals(6, laskin.mul(2, 3));
    }

    @Test
    void div() {
        assertEquals(0, laskin.div(2, 3));
    }

    @Test
    void divByZero() {
        assertThrows(IllegalArgumentException.class, () -> laskin.div(2, 0));
    }

}