import java.util.*;
public class loopies {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of time: ");
        int i=sc.nextInt();
        for(i=0; i<20;i++){
            if(i%2==0){
                System.out.println("Even no: "+i);
        }
    }
}
}