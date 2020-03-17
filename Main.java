import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);

		int maior = 0;
		int soma = 0;
		int M = ent.nextInt();
		int N = ent.nextInt();
		if((M<=0) || (N<=0)){
	        System.exit(0);
	    }else if(M>N){
	        maior = M;
	        M = N;
	        N = maior;
	    }
	    
		for(int i = M; i <= N; i++){
		    
		    soma += i;
		    System.out.printf("%d ", i);
		}
		System.out.println(" Sum=" + soma);	
		
	}
}
