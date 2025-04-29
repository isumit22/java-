import java.util.Scanner;
public class hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int i = sc.nextInt();
        for(int j=0;j<i;j++){
            for(int k=i;k>0;k--){
                if(k==i-j || k==1 || j==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
