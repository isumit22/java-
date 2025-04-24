import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int i = sc.nextInt();
        for(int j=0;j<i;j++){
            for(int k=i-j;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
