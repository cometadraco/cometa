package tudelft.sum;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TwoNumbersSumTest {
    @Test
    public void testAddTwoNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        // Caso 1: 12 + 34
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(3);
        second.add(4);
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, result);
        // Caso 2: 99 + 1
        first = new ArrayList<>();
        first.add(9);
        first.add(9);
        second = new ArrayList<>();
        second.add(1);
        result = sum.addTwoNumbers(first, second);
        expected = new ArrayList<>();
        expected.add(1);
        expected.add(0);
        expected.add(0);
        assertEquals(expected, result);
        // Caso 3: 123 + 987
        first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        second = new ArrayList<>();
        second.add(9);
        second.add(8);
        second.add(7);
        result = sum.addTwoNumbers(first, second);
        expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(0);
        assertEquals(expected, result);
    }
}
