
// TODO1 : plus
// TODO2 : minus
// TODO3 : multiply
// TODO4 : divide

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.plus(1, 2), is(3));
    }
}
