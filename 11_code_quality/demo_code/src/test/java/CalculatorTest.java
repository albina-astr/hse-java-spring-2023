import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author albina-gima
 * @date 4/5/23
 */
public class CalculatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNullValuesWhileSumShouldThrowException() {
        // when
        Calculator calculator = new Calculator();
        calculator.add(2, null);
    }

    @Test
    public void testSumShouldBeCorrect() {
        // given
        int a = 2;
        int b = 3;
        int expected = 5;

        // when
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);

        // then
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullValuesWhileSubtractShouldThrowException() {
        // when
        Calculator calculator = new Calculator();
        calculator.subtract(null, null);
    }

    @Test
    public void testSubtractShouldBeCorrect() {
        // given
        int a = 2;
        int b = 3;
        int expected = -1;

        // when
        Calculator calculator = new Calculator();
        int result = calculator.subtract(a, b);

        // then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        Assert.assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideMustThrowException() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}
