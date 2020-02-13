
// TODO1 : plus
// TODO2 : minus
// TODO3 : multiply
// TODO4 : divide

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void plus() {
        assertThat(calculator.plus(1, 2), is(3));
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(3, 1), is(2));
    }
}
