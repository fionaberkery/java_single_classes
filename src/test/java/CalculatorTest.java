import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.addValues(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtractValues(8, 4));
    }

    @Test
    public void canMultiply(){
        assertEquals(20, calculator.multiplyValues(2, 10));
    }

    @Test
    public void canDivideDoubles(){
        assertEquals(2.8674560733384262, calculator.divideValues(150.14, 52.36), 0.0);
    }
}



