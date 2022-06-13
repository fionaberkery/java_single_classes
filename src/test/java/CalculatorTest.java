import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(8, 4);
    }

    @Test
    public void canAdd() {
        assertEquals(12, calculator.addValues());
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtractValues());
    }

    @Test
    public void canMultiply(){
        assertEquals(32, calculator.multiplyValues());
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divideValues());
    }
}
