package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {
    @Test
    public void testForNumber3ReturnsFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzbuzz.forNumber(3));
    }
}
