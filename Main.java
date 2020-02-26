import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Main {
 
    public static void main(String[] args){
        
		Scanner ent = new Scanner(System.in);
		
		double nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda50, moeda25, moeda10, moeda5, moeda1;
		double valor = ent.nextDouble();
		double vlrAtual = valor;
		
		nota100 = vlrAtual/100.00;
		vlrAtual -= nota100*100.00;
		nota50 = vlrAtual/50.00;
		vlrAtual -= nota50*50.00;
		nota20 = vlrAtual/20.00;
		vlrAtual -= nota20*20.00;
		nota10 = vlrAtual/10.00;
		vlrAtual -= nota10*10.00;
		nota5 = vlrAtual/5.00;
		vlrAtual -= nota5*5.00;
		nota2 = vlrAtual/2.00;
		vlrAtual -= nota2*2.00;
		
		
		
    }
}
