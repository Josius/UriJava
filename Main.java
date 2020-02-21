import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Main {
 
    public static void main(String[] args){
        //1018
        
        Scanner ent = new Scanner(System.in);        
        
        int[] divisores = {100, 50, 20, 10, 5, 2, 1};
        int num1, tot;
        num1 = ent.nextInt();
        
        for(int i=0; i <=7; i++){
            tot = num1/divisores[i];
            System.out.println(tot);
        }
        
        
//        System.out.println(num1/num2);
  //      System.out.println(num1%num2);
    }
}
