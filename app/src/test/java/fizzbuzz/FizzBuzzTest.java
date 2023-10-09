package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testForNumber3ReturnsFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzbuzz.forNumber(3));
    }

    @Test
    public void testForNumber5ReturnsBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzbuzz.forNumber(5));
    }
}
