import java.util.*;


class FirstClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        int sum= a+ b;
        System.out.println("Hello, "+ name);
        System.out.println("This is the first class in the project.");
        System.out.println("The value of a is: " + sum);

        
    }
} 