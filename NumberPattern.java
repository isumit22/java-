import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        int width = 2 * n - 1; 
        int center = width / 2;

        for (int i = 0; i < n; i++) {
            int digit = i + 1;
            for (int j = 0; j < width; j++) {
                if (i == 0) {
                    System.out.print(j == center ? digit : " ");
                } else if (i == 1) {
                    System.out.print((j == center - 1 || j == center + 1) ? digit : " ");
                } else {
                    int start = center - i;
                    if (j >= start && (j - start) % 2 == 0 && j <= center + i) {
                        System.out.print(digit);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
