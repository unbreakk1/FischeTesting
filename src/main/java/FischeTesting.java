public class FischeTesting
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 2;
        int sum = add(a, b);
        int product = multiply(a, b);
        String string = "hello world";

        System.out.println("Summe: " + sum);
        System.out.println("Is Even: " + checkIsEven(a));
        System.out.println("Product: " + product);
        System.out.println("Original String: " + string);
        System.out.println("Uppercase String: " + convertString(string));
        System.out.println("Is Positive: " + checkIsPositive(a));
    }

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static boolean checkIsEven(int a)
    {
        return a % 2 == 0;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static String convertString(String param)
    {
        return param.toUpperCase();
    }

    public static boolean checkIsPositive(int a)
    {
        return a > 0;
    }
}
