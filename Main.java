import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		
		int casos = ent.nextInt();
		int x, y, maior=0, soma=0;
		for(int i=0; i<casos; i++){
			x = ent.nextInt();
			y = ent.nextInt();
			for( ;x<y; x++){
				if(x>y){
					maior=x;
					x=y;
					y=maior;	
					
				}
				if(x%2 == 1){
					soma += x;
				}
			}
			System.out.println(soma);
			System.out.println("x: " + x + "y: " + y);
			soma = 0;
		}	
		
	}
}