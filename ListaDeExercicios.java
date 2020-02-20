import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class ListaDeExercicios {
 
    public static void main(String[] args){
		
		//1002
		/*
		Scanner ent = new Scanner(System.in);
        double raio = ent.nextDouble();
		double n = 3.14159;
		
		double Area = n*pow(raio,2);
		
		System.out.printf("A=%.4f", Area);
        System.out.println();
		*/
		//1003
		/*
		Scanner ent = new Scanner(System.in);
		int a = ent.nextInt();
		int b = ent.nextInt();
		int soma = a + b;
		System.out.println("SOMA = "+soma);
		*/
		//1004
		/*
		Scanner ent = new Scanner(System.in);
		int a = ent.nextInt();
		int b = ent.nextInt();
		
		int prod = a * b;
		
		System.out.println("PROD = "+ prod);
		*/
		//1005
		/*
		Scanner ent = new Scanner(System.in);
		double a = ent.nextDouble();
		double b = ent.nextDouble();
		
		double media = ((a*3.5) + (b*7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		*/
		//1006
		/*
		Scanner ent = new Scanner(System.in);
		
		double a = ent.nextDouble();
		double b = ent.nextDouble();
		double c = ent.nextDouble();
		
		double media = ((a*2.0)+(b*3.0)+(c*5.0))/10;
		
		System.out.printf("MEDIA = %.1f\n", media);
		*/
		//1007
		/*
		Scanner ent = new Scanner(System.in);
		
		int a = ent.nextInt();
		int b = ent.nextInt();
		int c = ent.nextInt();
		int d = ent.nextInt();
		
		int total = ((a*b)-(c*d));
		
		System.out.println("DIFERENÇA = " + total);
		*/
		//1008
		/*
		Scanner ent = new Scanner(System.in);
		
		int num = ent.nextInt();
		int horas = ent.nextInt();
		double valorPHora = ent.nextDouble();
		
		double salario = horas*valorPHora;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", num, salario);
		*/
		//1009
		/*
		Scanner ent = new Scanner(System.in);
		double salFixo, vendas, comissao, salTotal;
		
		String nome = ent.next();
		
		salFixo = ent.nextDouble();
		vendas = ent.nextDouble();
		comissao = vendas*0.15;
		salTotal = salFixo+comissao;

		System.out.printf("TOTAL = R$ %.2f\n", salTotal);
        */
		//1010
		/*
		Scanner ent = new Scanner(System.in);
		
		int cod, qtd;
		double valor, total, aPagar;
		
		aPagar = 0;
		for(int i=1; i<=2; i++){
			cod = ent.nextInt();
			qtd = ent.nextInt();
			valor = ent.nextDouble();
			total = qtd*valor;
			aPagar +=total;
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", aPagar);
		*/
		//1011
		/*
		Scanner ent = new Scanner(System.in);
		
		double vol, raio, pi, k;
		k=4.0/3;
		pi = 3.14159;
		raio = ent.nextDouble();
		vol = pi*k*pow(raio,3);
		
		System.out.printf("VOLUME = %.3f\n", vol);
		*/
		//1012
		/*
		Scanner ent = new Scanner(System.in);
		
		double a, b, c, pi, Tri, Cir, Tra, Qua, Ret;
		pi = 3.14159;
		a = ent.nextDouble();
		b = ent.nextDouble();
		c = ent.nextDouble();
		
		//Area do Triangulo
		Tri = (a*c)/2;
		//Area do Circulo
		Cir = pi*pow(c, 2);
		//Area do Trapézio
		Tra = ((a+b)*c)/2;
		//Area do Quadrado
		Qua = pow(b, 2);
		//Area do Retangulo
		Ret = a*b;
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", Tri, Cir, Tra, Qua, Ret);
		*/
		//1013
		/*
		Scanner ent = new Scanner(System.in);
		
		int a, b, c, maiorAB, maiorCBA;
		
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		maiorAB = (a+b+abs(a-b))/2;
		maiorCBA = (maiorAB+c+abs(maiorAB-c))/2;
		
		System.out.println(maiorCBA + " eh o maior");
		*/
		//1014
		/*
		Scanner ent = new Scanner(System.in);
		
		int dist = ent.nextInt();
		double comb = ent.nextDouble();
		
		double cons = dist/comb;
		
		System.out.printf("%.3f km/l\n", cons);
		*/
		//1015
		/*
		Scanner ent = new Scanner(System.in);
		double[] vetor = new double[4];
		
		for(int i=0; i<vetor.length; i++){
			vetor[i] = ent.nextDouble();
		}
		
		double dist = sqrt(pow(abs(vetor[2]-vetor[0]),2) + pow(abs(vetor[3]-vetor[1]),2));
		
		System.out.printf("%.4f\n",dist);
		*/
		//1016
		/*        
        Scanner ent = new Scanner(System.in);
        int a = ent.nextInt();
        System.out.println(a*2 + " minutos");
		*/
    }
}