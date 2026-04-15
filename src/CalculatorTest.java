import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(6, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }
}