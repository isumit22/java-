import java.util.Scanner;
class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NO: ");
        int No1 = sc.nextInt();
        int No2 = sc.nextInt();
        if (No1 == No2) {
            System.out.println("Both numbers are equal.");
        } else if(No1 > No2) {
            System.out.println(No1 + " is greater.");
        }
        else {
            System.out.println(No2 + " is greater.");
        }
    }
    
}
