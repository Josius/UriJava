import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Main {
 
    public static void main(String[] args){
        //1018
        
        Scanner ent = new Scanner(System.in);        
        
		int valorEnt = ent.nextInt();
		int valor = 0;
		String s = Integer.toString(valorEnt);
		
		if((valorEnt > 0) && (valorEnt < 1000000)){
			if(valorEnt >= 100){
				valor = valorEnt / 100;
				s += "\n" + valor + " nota(s) de R$ 100,00";
				valorEnt -= (valor*100);
				System.out.println("esi " + valorEnt);
			}
			
			if(valorEnt < 100){
				valor = valorEnt / 50;
				s += "\n" + valor + " nota(s) de R$ 50,00";
				valorEnt -=(valor*50);
				System.out.println("esi " + valorEnt);
			}
			if(valorEnt < 50){
				valor = valorEnt / 20;
				s += "\n" + valor + " nota(s) de R$ 20,00";
				valorEnt -=(valor*20);
				System.out.println("esi " + valorEnt);
			}
			if(valorEnt < 20){
				valor = valorEnt / 10;
				s += "\n" + valor + " nota(s) de R$ 10,00";
				valorEnt -=(valor*10);
				System.out.println("esi " + valorEnt);
			}
			if(valorEnt < 10){
				valor = valorEnt / 5;
				s += "\n" + valor + " nota(s) de R$ 5,00";
				valorEnt -=(valor*5);
				System.out.println("esi " + valorEnt);
			}
			if(valorEnt < 5){
				valor = valorEnt / 2;
				s += "\n" + valor + " nota(s) de R$ 2,00";
				valorEnt -=(valor*2);
				System.out.println("esi " + valorEnt);
			}
			if(valorEnt < 2){
				valor = valorEnt / 1;
				s += "\n" + valor + " nota(s) de R$ 1,00";
				valorEnt -=(valor*1);
				System.out.println("esi " + valorEnt);
			}
		}
		
		System.out.println(s);
		
    }
}
