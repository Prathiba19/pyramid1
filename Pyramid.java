# pyramid1
import java.util.Scanner;

public class Pyramid {
 
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
               System.out.println("Enter the range : ");
               int i=sc.nextInt();
                for(int j=1; j<= i ;j++){
                       
                        for(int k=0; k < j; k++){
                                System.out.print(k+1);
                        }
                       
                        System.out.println("");
                }
 
        }
}
