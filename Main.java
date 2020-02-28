import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Main {
 
    public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int a, b, c, d, par, soma1, soma2;
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		d = ent.nextInt();
		/*par = a%2;
		soma1 = c+d;
		soma2 = a+b;
		*/
		if((b>c) && (d>a)){
			if(c+d > a+b){
				if((c>0) && (d>0)){
					if(a%2==0){
						System.out.println("Valores aceitos");
					}
				}
			}
		}else if((b<=c) || (d<=a)){
			if(c+d <= a+b){
				if((c<=0) || (d<=0)){
					if(a%2!=0){
						System.out.println("Valores nao aceitos");
					}
				}
			}
		}
	}
}
