import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

class TestSumCalculator {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSum1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSum3() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
    @Test
    void testSumNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(-1));
    }
}
