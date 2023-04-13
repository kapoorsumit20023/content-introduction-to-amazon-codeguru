public class Example {

    public static int addNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int result = addNumbers(x, y);
        System.out.println("The sum of " + x + " and " + y + " is " + result);
    }
  
    public static int divideNumbers(int a, int b) {
    // Intentionally introduce an issue: division by zero
    int result = a / b;
    return result;
    }
}
