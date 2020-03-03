import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args){

		Scanner ent = new Scanner(System.in);
		
		String[] ddd = new String[75];
		
		ddd[61] = "Bra";
		ddd[71] = "Salvador";
		ddd[11] = "Sao Paulo";
		ddd[21] = "Rio de Janeiro";
		ddd[32] = "Juiz de Fora";
		ddd[19] = "Campinas";
		ddd[27] = "Vitoria";
		ddd[31] = "Belo Horizonte";
		
		int num = ent.nextInt();
		
		if(ddd[num]){
			System.out.println(ddd[num]);
		}else{
			System.out.println("DDD nao cadastrado");
		}
		
    }
}
