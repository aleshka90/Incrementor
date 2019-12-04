import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class NumberIncrementTest extends TestCase {
    @Test
    public void testGetNumber() {
        NumberIncrement number = new NumberIncrement();
        Assert.assertEquals(0,number.getNumber(),0.0);

    }
    @Test
    public void testIncrementNumber() {
        NumberIncrement number = new NumberIncrement();
        number.incrementNumber();
        Assert.assertEquals(1,number.getNumber(),0.0);
    }
    @Test
    public void testSetMaximumValue() {
        NumberIncrement number = new NumberIncrement();
        try {
            number.setMaximumValue(2147483647);
        } catch (Exception e) {
            e.printStackTrace();
        }
        number.incrementNumber();
        Assert.assertEquals(0,number.getNumber(),0.0);
        number.incrementNumber();
        Assert.assertEquals(1,number.getNumber(),0.0);
    }
}
