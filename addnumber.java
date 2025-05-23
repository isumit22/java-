public class addnumber {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 15;

        int result = addNumbers(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
