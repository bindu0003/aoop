import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class CadetSorterTest {

    @Test
    void testEmptyList() {
        List<Cadet> cadets = new ArrayList<>();
        CadetSorter.sortCadets(cadets);
        assertTrue(cadets.isEmpty(), "The list should remain empty after sorting.");
    }

    @Test
    void testSingleCadet() {
        List<Cadet> cadets = new ArrayList<>();
        cadets.add(new Cadet("Alex"));
        CadetSorter.sortCadets(cadets);
        assertEquals("Alex", cadets.get(0).getName(), "The single cadet should remain unchanged.");
    }

    @Test
    void testMultipleCadetsSorted() {
        List<Cadet> cadets = new ArrayList<>();
        cadets.add(new Cadet("Charlie"));
        cadets.add(new Cadet("Bob"));
        cadets.add(new Cadet("Alice"));

        CadetSorter.sortCadets(cadets);

        assertEquals("Alice", cadets.get(0).getName());
        assertEquals("Bob", cadets.get(1).getName());
        assertEquals("Charlie", cadets.get(2).getName());
    }

    @Test
    void testCadetsWithIdenticalNames() {
        List<Cadet> cadets = new ArrayList<>();
        cadets.add(new Cadet("David"));
        cadets.add(new Cadet("David"));
        cadets.add(new Cadet("Alice"));

        CadetSorter.sortCadets(cadets);

        assertEquals("Alice", cadets.get(0).getName());
        assertEquals("David", cadets.get(1).getName());
        assertEquals("David", cadets.get(2).getName());
    }

    @Test
    void testCadetsAlreadySorted() {
        List<Cadet> cadets = new ArrayList<>();
        cadets.add(new Cadet("Alice"));
        cadets.add(new Cadet("Bob"));
        cadets.add(new Cadet("Charlie"));

        CadetSorter.sortCadets(cadets);

        assertEquals("Alice", cadets.get(0).getName());
        assertEquals("Bob", cadets.get(1).getName());
        assertEquals("Charlie", cadets.get(2).getName());
    }
}
