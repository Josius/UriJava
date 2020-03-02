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
		//1017
		/*
		Scanner ent = new Scanner(System.in);
		
		int tempViag, velMed, distPer, kmPLt;
		
		kmPLt = 12;
		tempViag = ent.nextInt();
		velMed = ent.nextInt();
		distPer = tempViag * velMed;
		
    	double ltsNec = (double)distPer/kmPLt;
		
		System.out.printf("%.3f\n", ltsNec);
		*/
		//1018 - MINHA SOLUÇÃO COM 15% DE ERRO
		/*
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
		}else{
			System.exit(0);
		}
		
		System.out.println(s);
		*/
		//1018 - SOLUÇÃO CORRETA
		/*
		Scanner ent = new Scanner(System.in);        
        
		int valorEnt = ent.nextInt();
		int valorAtual = valorEnt;
		int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
		
		notas100 = valorAtual/100;
		valorAtual -= notas100*100;
		
		notas50 = valorAtual/50;
		valorAtual -= notas50*50;
		
		notas20 = valorAtual/20;
		valorAtual -= notas20*20;
		
		notas10 = valorAtual/10;
		valorAtual -= notas10*10;
		
		notas5 = valorAtual/5;
		valorAtual -= notas5*5;
		
		notas2 = valorAtual/2;
		valorAtual -= notas2*2;
		
		notas1 = valorAtual;
		
		System.out.println(valorEnt);
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
		*/
		//1019
        /*
        Scanner ent = new Scanner(System.in);        
        
		int valor = ent.nextInt();
		int hor, hor2, min, seg;
		
		hor = valor/3600;
		hor2 = valor%3600;
		min = hor2/60;
		seg = valor%60;
		
		System.out.printf(hor + ":" + min + ":" + seg + "\n");
		*/
		//1020
		/*
		Scanner ent = new Scanner(System.in);
		
		int ano, restAno, mes, dia;
		int valor = ent.nextInt();
		
		ano = valor/365;
		restAno = valor%365;
		mes = restAno/30;
		dia = restAno%30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
		*/
		//1021 - MINHA SOLUÇÃO COM 5% DE ERRO
		/*
		Scanner ent = new Scanner(System.in);
		
		double resto, nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;
		double valor = ent.nextDouble();
		double vlrAtual = valor;
		
		resto = vlrAtual%100;
		nota100 = (vlrAtual-resto)/100;
		vlrAtual = resto;
		
		resto = vlrAtual%50;
		nota50 = (vlrAtual-resto)/50;
		vlrAtual = resto;
		
		resto = vlrAtual%20;
		nota20 = (vlrAtual-resto)/20;
		vlrAtual = resto;
		
		resto = vlrAtual%10;
		nota10 = (vlrAtual-resto)/10;
		vlrAtual = resto;
		
		resto = vlrAtual%5;
		nota5 = (vlrAtual-resto)/5;
		vlrAtual = resto;
		
		resto = vlrAtual%2;
		nota2 = (vlrAtual-resto)/2;
		vlrAtual = resto;
		
		resto = vlrAtual%1;
		moeda1 = (vlrAtual-resto)/1;
		vlrAtual = resto;

		resto = vlrAtual%0.5;
		moeda50 = (vlrAtual-resto)/0.5;
		vlrAtual = resto;
		
		resto = vlrAtual%0.25;
		moeda25 = (vlrAtual-resto)/0.25;
		vlrAtual = resto;
		
		resto = vlrAtual%0.10;
		moeda10 = (vlrAtual-resto)/0.10;
		vlrAtual = resto;
		
		resto = vlrAtual%0.05;
		moeda5 = (vlrAtual-resto)/0.05;
		vlrAtual = resto;
		
		resto = vlrAtual%0.01;
		moeda01 = (vlrAtual-resto)/0.01;
		vlrAtual = resto;
		//MUDAR PARA PRINTF deu erro de 100 %
		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda50 + " moeda(s) de R$ 0.50");
		System.out.println(moeda25 + " moeda(s) de R$ 0.25");
		System.out.println(moeda10 + " moeda(s) de R$ 0.10");
		System.out.println(moeda5 + " moeda(s) de R$ 0.05");
		System.out.println(moeda01 + " moeda(s) de R$ 0.01");
		*/
		//1021 - SOLUÇÃO CORRETA
		//Pessoal, o erro acontece porque o double não arredonda valores abaixo de 0,4 para 0,5; ele arredonda para 0. Sendo assim, o ideial é multiplicar o valor recebido por 100 e somar 0.05. Na hora de realizar o calculo devemos fazer a correção dividindo o mesmo por 100. Segue exemplo abaixo:
		/*
		Scanner sc = new Scanner(System.in);

		double notas[] = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
		double moedas[] = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
		int qtdNota, qtdMoeda;

		double valor = sc.nextDouble();
		valor = (valor * 100) + 0.05;

		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			qtdNota = (int) (valor / (notas[i] * 100));
			valor %= notas[i] * 100;
			System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, notas[i]);
		}

		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			qtdMoeda = (int) (valor / (moedas[i] * 100));
			valor %= moedas[i] * 100;
			System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moedas[i]);
		}

		sc.close();
		*/
		//1035 - MINHA SOLUÇÃO COM 15% DE ERRO
		/*
		Scanner ent = new Scanner(System.in);
		
		int a, b, c, d;
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		d = ent.nextInt();
		
		if((b>c) && (d>a)){
			if(c+d > a+b){
				if((c>0) && (d>0)){
					if(a%2==0){
						System.out.println("Valores aceitos");
					}
				}
			}
		}else{
			System.out.println("Valores nao aceitos");
		}
		*/
		//1035 - SOLUÇÃO CORRETA
		/*
		Scanner ent = new Scanner(System.in);
		
		int a, b, c, d, par, soma1, soma2;
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		d = ent.nextInt();		
		
		if((b>c) && (d>a) && (c+d > a+b) && (c>0) && (d>0) && (a%2==0)){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
		*/
		//1036 - MINHA SOLUÇÃO COM 5% DE ERRO
		/*
		Scanner ent = new Scanner(System.in);
		
		double a, b, c, delta;
		a = ent.nextDouble();
		b = ent.nextDouble();
		c = ent.nextDouble();
		
		delta = Math.pow(b, 2) -(4*a*c);
				
		if((a == 0) || (delta < 0)){
		    System.out.println("Impossível calcular");
		}else{
		    double x1 = (((-1*b) + Math.pow(delta, 0.5))/(2*a));
		    double x2 = (((-1*b) - Math.pow(delta, 0.5))/(2*a));
		    System.out.printf("R1 = %.5f\n",x1);
		    System.out.printf("R2 = %.5f\n",x2);
		}
		*/
		//1036 - SOLUÇÃO CORRETA
		/*
		Scanner entrada = new Scanner(System.in);
		double A,B,C,DELTA;

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		DELTA = Math.pow(B,2) - (4 * A * C);

		if ((A==0) || (DELTA < 0)) {
			System.out.println("Impossivel calcular");
		}
		else {
			double R1 = (((-1 * B) + Math.pow(DELTA, 0.5)) / (2*A));
			double R2 = (((-1 * B) - Math.pow(DELTA, 0.5)) / (2*A));
			System.out.printf("R1 = %.5f\n",R1);
			System.out.printf("R2 = %.5f\n",R2);
		}
		*/
		//1037
		/*
		Scanner ent = new Scanner(System.in);
		
		double num = ent.nextDouble();
		
		if((num>=0.0) && (num<=25.0)){
			System.out.println("Intervalo [0,25]");
		}else if ((num>25.0) && (num<=50.0)){
			System.out.println("Intervalo (25,50]");
		}else if((num>50.0) && (num<=75.0)){
			System.out.println("Intervalo (50,75]");
		}else if((num>75.0) && (num<=100.0)){
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		*/
		//1038
		/*
		Scanner ent = new Scanner(System.in);
		
		int cod, qtd;
		double total;
		cod = ent.nextInt();
		qtd = ent.nextInt();
		
		if(cod==1){
			total = qtd * 4.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}if(cod==2){
			total = qtd * 4.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}if(cod==3){
			total = qtd * 5.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}if(cod==4){
			total = qtd * 2.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}if(cod==5){
			total = qtd * 1.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		*/
    }
}
