import java.util.*;
public class loopies {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int i=sc.nextInt();
        int j=0;
        int tab=0;
        while(j<=i){
            
            tab=tab+j;
            
            j++;
        }
        System.out.println(tab);
        // do{
        //     int tab=i*j;
        //     System.out.println(i + "*" + j + "=" +tab);
        //     j++;
        // }while(j<11);
    }
}
