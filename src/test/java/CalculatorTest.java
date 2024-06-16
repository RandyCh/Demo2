import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup for test");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Cleanup after test");
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        System.out.println("Test add method");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        System.out.println("Test subtract method");
    }
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(3, 2));
        System.out.println("Test subtract method");
    }

}

