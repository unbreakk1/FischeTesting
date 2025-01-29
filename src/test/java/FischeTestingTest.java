import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FischeTestingTest
{

    @Test
    void add_expectTwoPlusTwoEqualsFour()
    {
        int a = 2;
        int b = 2;
        int sum = FischeTesting.add(a, b);
        int expected = 4;
        assertEquals(expected, sum);
    }

    @Test
    void checkIsEven_expectTrue()
    {
        int a = 2;
        boolean isEven = FischeTesting.checkIsEven(a);
        assertTrue(isEven);
    }

    @Test
    void multiply_expectTwoTimesTwoEqualsFour()
    {
        int a = 2;
        int b = 2;
        int product = FischeTesting.multiply(a, b);
        int expected = 4;
        assertEquals(expected, product);
    }

    @Test
    void convertString_()
    {
        String param = "hello world";
        String expected = "HELLO WORLD";
        assertEquals(expected, FischeTesting.convertString(param));
    }

    @Test
    void checkIsPositive_expectTrue()
    {
        int a = 2;
        boolean isPositive = FischeTesting.checkIsPositive(a);
        assertTrue(isPositive);
    }
}