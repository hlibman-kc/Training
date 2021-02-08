import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HanksSetTest {

    private HanksSet set;

    @BeforeEach
    void setup() {
        set = new HanksSet();
    }

    @Test
    void testEmptySet() {
        assertEquals(0, set.size());
    }

    @Test
    void testAddElement() {
        set.add(10);
        assertEquals(1, set.size());
    }

    @Test
    void testAddSixElements() {
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        assertEquals(6, set.size());
        assertArrayEquals(new int[] {10, 20, 30, 40, 50, 60, 0, 0 ,0 ,0}, set.hanksSet);
    }

    @Test
    void testAddDuplicateElement() {
        set.add(10);
        set.add(10);
        assertEquals(1, set.size());
    }

    @Test
    void testDeleteElement() {
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.delete(20);
        assertEquals(3, set.size());
    }
}
