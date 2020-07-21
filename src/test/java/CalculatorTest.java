import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class CalculatorTest {
    Calculator calculator;

    @BeforeTest
    public void setUp(){
        calculator = new Calculator();

    }

    @Test
    public void addTest(){
        //Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(5,5),10);
    }

    @Test
    public void multificationTest(){
        //Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.multification(2,6),12);
    }
}
