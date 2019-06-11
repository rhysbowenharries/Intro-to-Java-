import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
         calculator = new Calculator();

    }


    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2,2), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(5,2), 0.01);
    }

    @Test
    public void canMultibly(){
        assertEquals(10, calculator.multiply(5,2), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(6,2), 0.01);
    }

}
