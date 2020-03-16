import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class ListaDeExercicios {
 
    public static void main(String[] args){
		
		//1002
		
		Scanner ent = new Scanner(System.in);
        double raio = ent.nextDouble();
		double n = 3.14159;
		
		double Area = n*pow(raio,2);
		
		System.out.printf("A=%.4f", Area);
        System.out.println();
		
		//1003
		
		Scanner ent = new Scanner(System.in);
		int a = ent.nextInt();
		int b = ent.nextInt();
		int soma = a + b;
		System.out.println("SOMA = "+soma);
		
		//1004
		
		Scanner ent = new Scanner(System.in);
		int a = ent.nextInt();
		int b = ent.nextInt();
		
		int prod = a * b;
		
		System.out.println("PROD = "+ prod);
		
		//1005
		
		Scanner ent = new Scanner(System.in);
		double a = ent.nextDouble();
		double b = ent.nextDouble();
		
		double media = ((a*3.5) + (b*7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		//1006
		
		Scanner ent = new Scanner(System.in);
		
		double a = ent.nextDouble();
		double b = ent.nextDouble();
		double c = ent.nextDouble();
		
		double media = ((a*2.0)+(b*3.0)+(c*5.0))/10;
		
		System.out.printf("MEDIA = %.1f\n", media);
		
		//1007
		
		Scanner ent = new Scanner(System.in);
		
		int a = ent.nextInt();
		int b = ent.nextInt();
		int c = ent.nextInt();
		int d = ent.nextInt();
		
		int total = ((a*b)-(c*d));
		
		System.out.println("DIFERENÇA = " + total);
		
		//1008
		
		Scanner ent = new Scanner(System.in);
		
		int num = ent.nextInt();
		int horas = ent.nextInt();
		double valorPHora = ent.nextDouble();
		
		double salario = horas*valorPHora;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", num, salario);
		
		//1009
		
		Scanner ent = new Scanner(System.in);
		double salFixo, vendas, comissao, salTotal;
		
		String nome = ent.next();
		
		salFixo = ent.nextDouble();
		vendas = ent.nextDouble();
		comissao = vendas*0.15;
		salTotal = salFixo+comissao;

		System.out.printf("TOTAL = R$ %.2f\n", salTotal);
        
		//1010
		
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
		
		//1011
		
		Scanner ent = new Scanner(System.in);
		
		double vol, raio, pi, k;
		k=4.0/3;
		pi = 3.14159;
		raio = ent.nextDouble();
		vol = pi*k*pow(raio,3);
		
		System.out.printf("VOLUME = %.3f\n", vol);
		
		//1012
		
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
		
		//1013
		
		Scanner ent = new Scanner(System.in);
		
		int a, b, c, maiorAB, maiorCBA;
		
		a = ent.nextInt();
		b = ent.nextInt();
		c = ent.nextInt();
		maiorAB = (a+b+abs(a-b))/2;
		maiorCBA = (maiorAB+c+abs(maiorAB-c))/2;
		
		System.out.println(maiorCBA + " eh o maior");
		
		//1014
		
		Scanner ent = new Scanner(System.in);
		
		int dist = ent.nextInt();
		double comb = ent.nextDouble();
		
		double cons = dist/comb;
		
		System.out.printf("%.3f km/l\n", cons);
		
		//1015
		
		Scanner ent = new Scanner(System.in);
		double[] vetor = new double[4];
		
		for(int i=0; i<vetor.length; i++){
			vetor[i] = ent.nextDouble();
		}
		
		double dist = sqrt(pow(abs(vetor[2]-vetor[0]),2) + pow(abs(vetor[3]-vetor[1]),2));
		
		System.out.printf("%.4f\n",dist);
		
		//1016
		        
        Scanner ent = new Scanner(System.in);
        int a = ent.nextInt();
        System.out.println(a*2 + " minutos");
		
		//1017
		
		Scanner ent = new Scanner(System.in);
		
		int tempViag, velMed, distPer, kmPLt;
		
		kmPLt = 12;
		tempViag = ent.nextInt();
		velMed = ent.nextInt();
		distPer = tempViag * velMed;
		
    	double ltsNec = (double)distPer/kmPLt;
		
		System.out.printf("%.3f\n", ltsNec);
		
		//1018 - MINHA SOLUÇÃO COM 15% DE ERRO
		
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
		
		//1018 - SOLUÇÃO CORRETA
		
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
		
		//1019
        
        Scanner ent = new Scanner(System.in);        
        
		int valor = ent.nextInt();
		int hor, hor2, min, seg;
		
		hor = valor/3600;
		hor2 = valor%3600;
		min = hor2/60;
		seg = valor%60;
		
		System.out.printf(hor + ":" + min + ":" + seg + "\n");
		
		//1020
		
		Scanner ent = new Scanner(System.in);
		
		int ano, restAno, mes, dia;
		int valor = ent.nextInt();
		
		ano = valor/365;
		restAno = valor%365;
		mes = restAno/30;
		dia = restAno%30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
		
		//1021 - MINHA SOLUÇÃO COM 5% DE ERRO
		
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
		
		//1021 - SOLUÇÃO CORRETA
		//Pessoal, o erro acontece porque o double não arredonda valores abaixo de 0,4 para 0,5; ele arredonda para 0. Sendo assim, o ideial é multiplicar o valor recebido por 100 e somar 0.05. Na hora de realizar o calculo devemos fazer a correção dividindo o mesmo por 100. Segue exemplo abaixo:
		
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
		
		//1035 - MINHA SOLUÇÃO COM 15% DE ERRO
		
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
		
		//1035 - SOLUÇÃO CORRETA
		
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
		
		//1036 - MINHA SOLUÇÃO COM 5% DE ERRO
		
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
		
		//1036 - SOLUÇÃO CORRETA
		
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
		
		//1037
		
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
		
		//1038
		
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
		
		//1040
		
		Scanner ent = new Scanner(System.in);
		
		float num1, num2, num3, num4, exame, media;
		num1 = ent.nextFloat();
		num2 = ent.nextFloat();
		num3 = ent.nextFloat();
		num4 = ent.nextFloat();
		
		media = ((2*num1)+(3*num2)+(4*num3)+(1*num4))/10;
		
		System.out.printf("Media: %.1f%n", media);
		
		if(media < 5.0){
			System.out.println("Aluno reprovado.");
		}else if(media <= 6.9){
			System.out.println("Aluno em exame.");
			exame = ent.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", exame);
			media = (media + exame)/2;
			
			if(media<=4.9){
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", media);
			}else{
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", media);
			}
		}else{
			System.out.println("Aluno aprovado.");
		}
		
		//1040 - UMA SOLUÇÃO INTERESSANTE
		
		import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        double N1 = (entrada.nextDouble() * 2) / 10;
        double N2 = (entrada.nextDouble() * 3) / 10;
        double N3 = (entrada.nextDouble() * 4) / 10;
        double N4 = (entrada.nextDouble() * 1) / 10;
        double N5;
        double media = N1 + N2 + N3 + N4;

        if (media*10 - Math.floor(media*10) > 0.5001) {
          media = Math.ceil(media*10)/10;
        }

        else {
           media = Math.floor(media*10)/10;
        }

       System.out.printf("Media: %.1f\n", media);
        if (media < 5.0) {
          System.out.println("Aluno reprovado.");
        }
        if (media >= 7.0) {
          System.out.printf("Aluno aprovado.\n");
        }
        else if (media >= 5.0) {
          System.out.printf("Aluno em exame.\n");
          N5 = entrada.nextDouble();
          System.out.printf("Nota do exame: %.1f\n",N5);
          media = (media + N5) / 2;
          if (media >= 5) {
            System.out.println("Aluno aprovado.");
          }
          else {
            System.out.println("Aluno reprovado.");
          }
          System.out.printf("Media final: %.1f\n",media);

        }

    }
}
		
		//1041
		
		Scanner ent = new Scanner(System.in);
		
		double x, y;
		x = ent.nextDouble();
		y = ent.nextDouble();
		
		if((x==0) && (y==0)){
			System.out.println("Origem");
		}else if((x==0) && (y!=0)){
			System.out.println("Eixo Y");
		}else if((x!=0) && (y==0)){
			System.out.println("Eixo X");
		}else if((x>0) && (y>0)){
			System.out.println("Q1");
		}else if((x<0) && (y>0)){
			System.out.println("Q2");
		}else if((x<0) && (y<0)){
			System.out.println("Q3");
		}else if((x>0) && (y<0)){
			System.out.println("Q4");
		}
		
		//1042
		
		Scanner ent = new Scanner(System.in);
        
        int num1, num2, num3, menor, medio, maior;

		num1 = ent.nextInt();
		num2 = ent.nextInt();
		num3 = ent.nextInt();
		
		menor = num1;
		medio = num2;
		maior = num3;
        
		if((num1 < num2) && (num1 < num3)){
		    menor = num1;
		    if(num2 <= num3){
		        medio = num2;
		        maior = num3;
		    }else{
		        medio = num3;
		        maior = num2;
		    }
		}
		if((num2 < num1) && (num2 < num3)){
		    menor = num2;
		    if(num1 <= num3){
		        medio = num1;
		        maior = num3;
		    }else{
		        medio = num3;
		        maior = num1;
		    }   
		}
		if((num3 < num1) && (num3 < num2)){
		    menor = num3;
		    if(num1 <= num2){
		        medio = num1;
		        maior = num2;
		    }else{
		        medio = num2;
		        maior = num1;
		    }
		}
		
		System.out.println(menor);
		System.out.println(medio);
		System.out.println(maior);
		System.out.println();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//1043
		
		        Scanner ent = new Scanner(System.in);
        double a, b, c;
        a = ent.nextDouble();
        b = ent.nextDouble();
        c = ent.nextDouble();
        
        if((abs(a-c) < b) && (b < (a+c))){
            System.out.println("Perimetro = " + (a+b+c));
        }else{
            System.out.println("Area = " + ((a+b)*c)/2);
        }
		
		//1044 - MINHA SOLUÇÃO COM PRESENTATION ERROR
		
		Scanner ent = new Scanner(System.in);
        int x, y, div;
        x = ent.nextInt();
        y = ent.nextInt();
        
        if(x < y){
            div = y%x;
            if(div == 0){
                System.out.println("Sao multiplos");
            }else{
                System.out.println("Nao sao multiplos");
            }
        }else if(y < x){
            div = x%y;
            if(div == 0){
                System.out.println("Sao multiplos");
            }else{
                System.out.println("Nao sao multiplos");
            }
        }
		
		//1044 - SOLUÇÃO CORRETA
		
		Scanner ent = new Scanner(System.in);
        
        int a = ent.nextInt();
        int b = ent.nextInt();
        
        if((a%b == 0) || (b%a == 0)){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");
        }
		
		//1045
		
		Scanner ent = new Scanner(System.in);
		double a, b, c, menor, medio, maior, A,B,C;
		
		a = ent.nextDouble();
		b = ent.nextDouble();
		c = ent.nextDouble();
		menor = 0;
		medio = 0;
		maior = 0;
		
		if((a <= b) && (a <= c)){
			menor = a;
			if(b <= c){
				medio = b;
				maior = c;
			}else{
				medio = c;
				maior =b;
			}
		}
		if((b <= a) && (b <= c)){
			menor = b;
			if(a <= c){
				medio = a;
				maior =c;
			}else{
				medio = c;
				maior = a;
			}
		}
		if((c <= a) && (c <= b)){
			menor = c;
			if(a < b){
				medio = a;
				maior = b;
			}else{
				medio = b;
				maior = a;
			}
		}
		
		A = pow(maior,2);
		B = pow(medio,2);
		C = pow(menor,2);
		
		if(maior >= (menor + medio)){
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			if(A == (B+C)){
				System.out.println("TRIANGULO RETANGULO");
			}
			if(A > (B+C)){
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(A < (B+C)){
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if((a==b) && (b==c) && (c==a)){
				System.out.println("TRIANGULO EQUILATERO");
			}
			if(((a==b) && (b!=c)) || ((b==c) && (c!=a)) || ((c==a) && (a!=b))){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		//1046 - MINHA SOLUÇÃO COM 5% DE ERRO
		
		Scanner ent = new Scanner(System.in);
		int inicio, fim, duracao, dia;
		inicio = ent.nextInt();
		fim = ent.nextInt();
		dia = 24;
		duracao = abs(inicio-fim);
		
		if(inicio==fim){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		if(inicio > fim){
			dia -= duracao;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		if(inicio < fim){
			dia -= duracao;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		//1046 - SOLUÇÃO CORRETA
				
		Scanner teclado = new Scanner(System.in);

		int ini,fim, duracao;
		ini = teclado.nextInt();
		fim = teclado.nextInt();
			
		if(ini == fim){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(ini > fim){
			duracao = (24 - ini) + fim ;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
		else if(ini < fim){
			duracao = fim - ini;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
		
		//1047 - MINHA SOLUÇÃO COM 5% DE ERRO
		
		int ini,fim, minIni, minFim, duracao;
		ini = ent.nextInt();
		minIni = ent.nextInt();
		fim = ent.nextInt();
		minFim = ent.nextInt();
			
		if(ini == fim){
			if(minIni < minFim){
				System.out.println("O JOGO DUROU 24 HORA(S) E "+(minFim-minIni)+" MINUTO(S)");
			}if(minIni == minFim){
				System.out.println("O JOGO DUROU 24 HORA(S) E "+(minFim-minIni)+" MINUTO(S)");
			}if(minIni > minFim){
				System.out.println("O JOGO DUROU 23 HORA(S) E "+((60 - minIni)+minFim)+" MINUTO(S)");
			}
		}
		else if(ini > fim){
			
			if(minIni < minFim){
				duracao = (24 - ini) + fim ;
				System.out.println("O JOGO DUROU "+duracao+" HORA(S) E "+(minFim-minIni)+" MINUTO(S)");
			}if(minIni == minFim){
				duracao = (24 - ini) + fim ;
				System.out.println("O JOGO DUROU "+duracao+" HORA(S) E "+(minFim-minIni)+" MINUTO(S)");
			}if(minIni > minFim){
				duracao = (23 - ini) + fim ;
				System.out.println("O JOGO DUROU "+duracao+" HORA(S) E "+((60 - minIni)+minFim)+" MINUTO(S)");
			}
		}
		else if(ini < fim){
			if(minIni < minFim){
				duracao = fim-ini;
				System.out.println("O JOGO DUROU "+duracao+" HORA(S) E "+(minFim-minIni)+" MINUTO(S)");
			}if(minIni == minFim){
				duracao = fim-ini;
				System.out.println("O JOGO DUROU "+duracao+" HORA(S) E "+(minFim-minIni)+" MINUTO(S)");
			}if(minIni > minFim){
				duracao = ((fim-ini)-1);
				System.out.println("O JOGO DUROU "+duracao+" HORA(S) E "+((60 - minIni)+minFim)+" MINUTO(S)");
			}
		}
		
		//1047 - SOLUÇÃO CORRETA - CONVERTE TUDO EM MINUTOS, POIS TRABALHA COM HEXADECIMAL
		
		Scanner entrada = new Scanner(System.in);
        int h1 = entrada.nextInt();
        int m1 = entrada.nextInt();
        int h2 = entrada.nextInt();
        int m2 = entrada.nextInt();
        int mt1 = (h1*60) + m1;
        int mt2 = (h2*60) + m2;
        int h24 = (24*60);
        int resultado = 0;
        if(mt2>mt1){
            resultado = mt2-mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt1>mt2){
            resultado = (h24-mt1)+(mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt2==mt1){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
		
		//1048
		
		Scanner ent = new Scanner(System.in);
		double sal, novoSal, reajuste;
		sal = ent.nextDouble();
		
		if((sal>0) && (sal<=400.0)){
			reajuste = (sal*15)/100;
			novoSal = sal + reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%n", novoSal, reajuste);
			System.out.println("Em percentual: 15 %");
			
		}else if((sal>400.0) && (sal<=800.0)){
			reajuste = (sal*12)/100;
			novoSal = sal + reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%n", novoSal, reajuste);
			System.out.println("Em percentual: 12 %");
		}else if((sal>800.0) && (sal<=1200.0)){
			reajuste = (sal*10)/100;
			novoSal = sal + reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%n", novoSal, reajuste);
			System.out.println("Em percentual: 10 %");
		}else if((sal>1200.0) && (sal<=2000.0)){
			reajuste = (sal*7)/100;
			novoSal = sal + reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%n", novoSal, reajuste);
			System.out.println("Em percentual: 7 %");
		}else if(sal>2000.0){
			reajuste = (sal*4)/100;
			novoSal = sal + reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%n", novoSal, reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		//1049
		
		Scanner ent = new Scanner(System.in);
		
		String txt1, txt2, txt3;
		txt1 = ent.next();
		txt2 = ent.next();
		txt3 = ent.next();
		
		if(txt1.equalsIgnoreCase("vertebrado")){
			if(txt2.equalsIgnoreCase("ave")){
				if(txt3.equalsIgnoreCase("carnivoro")){
					System.out.println("aguia");
				}else if(txt3.equalsIgnoreCase("onivoro")){
					System.out.println("pomba");
				}
			}else if(txt2.equalsIgnoreCase("mamifero")){
				if(txt3.equalsIgnoreCase("onivoro")){
					System.out.println("homem");
				}else if(txt3.equalsIgnoreCase("herbivoro")){
					System.out.println("vaca");
				}
			}
		}
		
		if(txt1.equalsIgnoreCase("invertebrado")){
			if(txt2.equalsIgnoreCase("inseto")){
				if(txt3.equalsIgnoreCase("hematofago")){
					System.out.println("pulga");
				}else if(txt3.equalsIgnoreCase("herbivoro")){
					System.out.println("lagarta");
				}
			}else if(txt2.equalsIgnoreCase("anelideo")){
				if(txt3.equalsIgnoreCase("hematofago")){
					System.out.println("sanguessuga");
				}else if(txt3.equalsIgnoreCase("onivoro")){
					System.out.println("minhoca");
				}
			}
		}
		
		//1050 - MINHA SOLUÇÃO COM RUNTIME ERROR
		
		Scanner ent = new Scanner(System.in);
		
		String[] ddd = new String[75];
		
		for(int i=0; i<ddd.length; i++){
		    ddd[i] = "DDD nao cadastrado";
		}
		ddd[61] = "Brasilia";
		ddd[71] = "Salvador";
		ddd[11] = "Sao Paulo";
		ddd[21] = "Rio de Janeiro";
		ddd[32] = "Juiz de Fora";
		ddd[19] = "Campinas";
		ddd[27] = "Vitoria";
		ddd[31] = "Belo Horizonte";
		
		int num = ent.nextInt();
		
		System.out.println(ddd[num]);   
		
		ou
		
		Scanner ent = new Scanner(System.in);
		
		String[] ddd = new String[72];

		ddd[61] = "Brasilia";
		ddd[71] = "Salvador";
		ddd[11] = "Sao Paulo";
		ddd[21] = "Rio de Janeiro";
		ddd[32] = "Juiz de Fora";
		ddd[19] = "Campinas";
		ddd[27] = "Vitoria";
		ddd[31] = "Belo Horizonte";
		
		int num = ent.nextInt();
		
		if(ddd[num] != null){
			System.out.println(ddd[num]);
		}else{
			System.out.println("DDD nao cadastrado");
		}		
		
		//1050 - SOLUÇÃO CORRETA
		
				Scanner ent = new Scanner(System.in);
		
		int num = ent.nextInt();
		
		if(num==61){
		    System.out.println("Brasilia");
		}else if(num==71){
		    System.out.println("Salvador");
		}else if(num==11){
		    System.out.println("Sao Paulo");
		}else if(num==21){
		    System.out.println("Rio de Janeiro");
		}else if(num==32){
		    System.out.println("Juiz de Fora");
		}else if(num==19){
		    System.out.println("Campinas");
		}else if(num==27){
		    System.out.println("Vitoria");
		}else if(num==31){
		    System.out.println("Belo Horizonte");
		}else{
		    System.out.println("DDD nao cadastrado");
		}
		
		//1051
		
		Scanner ent = new Scanner(System.in);
		double renda, txImp1, txImp2, txImp3;
		renda = ent.nextDouble();
		
		if((renda>=0.0) && (renda<=2000.0)){
		    System.out.println("Isento");
		}
		if((renda>2000.0) && (renda<=3000.0)){
		    txImp1 = ((renda-2000.0)*0.08);
		    System.out.printf("R$ %.2f%n", txImp1);
		}
		if((renda>3000.0) && (renda<=4500.0)){
		    txImp1 = 1000.0*0.08;
    		txImp2 = ((renda-3000.0)*0.18);
		    System.out.printf("R$ %.2f%n", (txImp1+txImp2));
		}
		if(renda>4500.0){
		    txImp1 = 1000.0*0.08;
    		txImp2 = 1500.0*0.18;		    
		    txImp3 = ((renda-4500.0)*28)/100;
		    System.out.printf("R$ %.2f%n", (txImp1+txImp2+txImp3));
		}
		
		//1052
		
		Scanner ent = new Scanner(System.in);
        String[] mes = new String[13];
        
        mes[1] = "January";
        mes[2] = "February";
        mes[3] = "March";
        mes[4] = "April";
        mes[5] = "May";
        mes[6] = "June";
        mes[7] = "July";
        mes[8] = "August";
        mes[9] = "September";
        mes[10] = "October";
        mes[11] = "November";
        mes[12] = "December";
        
        int num = ent.nextInt();
        
        System.out.println(mes[num]);
		
		//1059
		
		for(int i=1; i<=100; i++){
		    if(i%2==0){
		        System.out.println(i);
		    }
		}
		
		//1060
		
		Scanner ent = new Scanner(System.in);
		
		double[] num = new double[6];
		int cont=0;
		for(int i=0; i<num.length; i++){
		    num[i] = ent.nextDouble();
		    if(num[i]>0){
		        cont++;
		    }
		}
		System.out.println(cont + " valores positivos");
		
		//1061 - O PROBLEMA DESSE EXERCICIO ESTA NA ENTRADA
		/*
		Exemplo de Entrada	Exemplo de Saída
			Dia 5				3 dia(s)
			08 : 12 : 23		22 hora(s)
			Dia 9				1 minuto(s)
			06 : 13 : 23		0 segundo(s)	
		A ENTRADA LE A STRING 'DIA' E O CARACTERE ':'
		*/
		//TENTAR ENTENDER MELHOR A CLASSE SCANNER, PQ ELA LE UM ESPACO COM UMA QUEBRA DE LINHA PARA OUTRO CARACTERE
		//VER:		https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
		Scanner ent = new Scanner(System.in);
		
		int di, hi, mi, si, df, hf, mf, sf, ti, tf, resDia, resHora, resMin;
		String text;
		
		text = ent.next();
		di = ent.nextInt();
		
		hi = ent.nextInt();
		text = ent.next();
		mi = ent.nextInt();
		text = ent.next();
		si = ent.nextInt();
		
		text = ent.next();
		df = ent.nextInt();
		
		hf = ent.nextInt();
		text = ent.next();
		mf = ent.nextInt();
		text = ent.next();
		sf = ent.nextInt();
		
		ti = (di*86400) + (hi*3600) + (mi*60) + si;
		tf = (df*86400) + (hf*3600) + (mf*60) + sf;
		resDia = tf - ti;
		resHora = resDia%86400;
		resMin = resHora%3600;
		System.out.println(resDia/86400 + " dia(s)");
		System.out.println(resHora/3600 + " hora(s)");
		System.out.println(resMin/60 + " minuto(s)" );
		System.out.println(resMin%60 + " segundo(s)");
		
		//O PROBLEMA NAO VERIFICA SE A DATA INICIAL FOR MAIOR QUE A DATA FINAL
		/*
		if(tf == ti){
			System.out.println(resDia/86400 + " dia(s)");
			System.out.println(resHora/3600 + " hora(s)");
			System.out.println(resMin/60 + " minuto(s)" );
			System.out.println(resMin%60 + " segundo(s)");
		}if(ti>tf){
			System.out.println(abs(resDia/86400) + " dia(s)");
			System.out.println(abs(resHora/3600) + " hora(s)");
			System.out.println(abs(resMin/60) + " minuto(s)" );
			System.out.println(abs(resMin%60) + " segundo(s)");
		}else{
			System.out.println(resDia/86400 + " dia(s)");
			System.out.println(resHora/3600 + " hora(s)");
			System.out.println(resMin/60 + " minuto(s)" );
			System.out.println(resMin%60 + " segundo(s)");
		}*/
		//OUTRA RESOLUCAO INTERESSANTE COM OUTRO TIPO DE ENTRADA PARA ESSE PROBLEMA
		//VER:		https://www.devmedia.com.br/metodos-split-e-indexof-mais-metodos-da-classe-string/23458	
		/*
		Scanner entrada = new Scanner(System.in);

		String dia_1 = entrada.nextLine();
		String dia_1_horario = entrada.nextLine();

		String[] dia_1_split = dia_1.split(" ");
		String[] dia_1_horario_split = dia_1_horario.split(" : ");

		String dia_2 = entrada.nextLine();
		String dia_2_horario = entrada.nextLine();

		String[] dia_2_split = dia_2.split(" ");
		String[] dia_2_horario_split = dia_2_horario.split(" : ");

		int dia_1_dia = Integer.parseInt(dia_1_split[1]);

		int dia_1_hora = Integer.parseInt(dia_1_horario_split[0]);
		int dia_1_minutos = Integer.parseInt(dia_1_horario_split[1]);
		int dia_1_segundos = Integer.parseInt(dia_1_horario_split[2]);

		int dia_2_dia = Integer.parseInt(dia_2_split[1]);

		int dia_2_hora = Integer.parseInt(dia_2_horario_split[0]);
		int dia_2_minutos = Integer.parseInt(dia_2_horario_split[1]);
		int dia_2_segundos = Integer.parseInt(dia_2_horario_split[2]);

		dia_1_segundos = (dia_1_dia * 24 * 60 * 60) + (dia_1_hora * 60 * 60) + (dia_1_minutos * 60) + (dia_1_segundos);

		dia_2_segundos = (dia_2_dia * 24 * 60 * 60) + (dia_2_hora * 60 * 60) + (dia_2_minutos * 60) + (dia_2_segundos);

		int  diferenca_segundos = dia_2_segundos - dia_1_segundos;

		int diferenca_segundos_atual = diferenca_segundos;

		int dias = diferenca_segundos_atual / (24 * 60 * 60);
		diferenca_segundos_atual -= dias * 24 * 60 * 60;

		int horas = diferenca_segundos_atual / (60 * 60);
		diferenca_segundos_atual -= horas * 60 * 60;

		int minutos = diferenca_segundos_atual / (60);
		diferenca_segundos_atual -= minutos * 60;

		int segundos = diferenca_segundos_atual;

		System.out.printf("%s dia(s)\n", dias);
		System.out.printf("%s hora(s)\n", horas);
		System.out.printf("%s minuto(s)\n", minutos);
		System.out.printf("%s segundo(s)\n", segundos);
		*/
		
		//1064
		
		Scanner ent = new Scanner(System.in);
		
		double[] num = new double[6];
		int cont = 0;
		double media = 0;
		
		for(int i=0; i<num.length; i++){
			num[i] = ent.nextDouble();
			if(num[i] > 0){
				cont++;
				media += num[i];
			}
		}
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f%n", media/cont);
		
		//1065
		
		Scanner ent = new Scanner(System.in);
		
		int[] num = new int[5];
		int i = 0;
		int par = 0;
		while(i<num.length){
			num[i] = ent.nextInt();
			if(num[i]%2 == 0){
				par++;
			}
			i++;
		}
		System.out.println(par + " valores pares");
		
		//1066
		
		Scanner ent = new Scanner(System.in);
		
		int[] nums = new int[5];
		int par, impar, positivo, negativo;
		int i = 0;
		par = 0;
		impar = 0;
		positivo = 0;
		negativo = 0;
		
		do{
			nums[i] = ent.nextInt();
			if(nums[i]%2 == 0){
				par++;
			}else{
				impar++;
			}
			if(nums[i]>0){
				positivo++;
			}else if(nums[i]<0){
				negativo++;
			}
			i++;
		}while(i<nums.length);
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		//1067
		
		Scanner ent = new Scanner(System.in);
		
		int num = ent.nextInt();
		int div = 0;
		
		for(int i=1; i<=num; i++){
			div = i % 2;
			if(div!=0){
				System.out.println(i);
			}
		}
		
		//1070
		
		Scanner ent = new Scanner(System.in);
		
		int num = ent.nextInt();
		
		for(int i = num; i <= num+11; i++){
			if(i%2 !=0){
				System.out.println(i);
			}
		}
		
		//1071
		
		Scanner ent = new Scanner(System.in);
		
		int x = ent.nextInt();
		int y = ent.nextInt();
		int soma = 0;
		
		if(x>y){
		    for(int i=x-1; i>y; i--){
		        if(i%2 != 0){
		            soma += i;
		        }
		    }		
		}else{
		    for(int i=y-1; i>x; i--){
		        if(i%2 != 0){
		            soma += i;
		        }
		    }
		}
		System.out.println(soma);
		
		//1072
		
		Scanner ent = new Scanner(System.in);
		
		int qtd = ent.nextInt();
		int teste, in, out;
		in = 0;
		out = 0;
		for(int i = 0; i < qtd; i++){
		    teste = ent.nextInt();
		    if((teste>=10) && (teste<=20)){
		        in++;
		    }else{
		        out++;
		    }
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		//1073
		
		Scanner ent = new Scanner(System.in);
        		
        int num = ent.nextInt();
        
        for(int i=1; i<=num; i++){
            if(i%2 == 0){
                System.out.printf("%d^2 = %.0f%n", i, pow(i,2));
            }
        }
		
		//1074
		
		Scanner ent = new Scanner(System.in);
        		
        int num = ent.nextInt();
        int teste;
        String[] resp = new String[num];
        for(int i=0; i<num; i++){
            teste = ent.nextInt();
            
            if((teste%2==0)&&(teste>0)){
                resp[i] = "EVEN POSITIVE";
            }
            if((teste%2==0)&&(teste<0)){
                resp[i] = "EVEN NEGATIVE";
            }            
            if((teste%2!=0)&&(teste>0)){
                resp[i] = "ODD POSITIVE";
            }
            if((teste%2!=0)&&(teste<0)){
                resp[i] = "ODD NEGATIVE";
            }
            if(teste==0){
                resp[i] = "NULL";
            }
        }
        for(int i=0; i<resp.length; i++){
            System.out.println(resp[i]);
        }
		
		//1075
		
		Scanner ent = new Scanner(System.in);
        		
        int num = ent.nextInt();
        
        for(int i=1; i<10000; i++){
            if(i%num == 2){
                System.out.println(i);
            }
            
        }
		
		//1078
		
		Scanner ent = new Scanner(System.in);
        		
        int num = ent.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(i + " x " + num + " = " + i*num);
        }
		
		//1079
		
		Scanner ent = new Scanner(System.in);
        		
        int num = ent.nextInt();
        double a, b, c;
        double[] array = new double[num];
        
        for(int i=0; i<num; i++){
            a = ent.nextDouble();
            b = ent.nextDouble();
            c = ent.nextDouble();
            array[i] = ((2*a) + (3*b) + (5*c))/10;
        }
        for(int i=0; i<num; i++){
            System.out.printf("%.1f%n", array[i]);
        }
		
		//1080
		
		Scanner ent = new Scanner(System.in);
        		
        int num;
        int maior = Integer.MIN_VALUE;
        int posicao = 0;
        
        for(int i=0; i<100; i++){
            num = ent.nextInt();
            if(num>maior){
                maior=num;
                posicao = i+1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
		
		//1094 - MINHA RESOLUÇÃO COM 15% DE ERRO
		
		Scanner ent = new Scanner(System.in);
        
        int casos = ent.nextInt();
        char animal;
        int qtd;
        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        int cobaias = 0;
        float perCoelho, perRato, perSapo;

        
        for(int i=0; i<casos; i++){
            qtd = ent.nextInt();
            animal = ent.next().charAt(0);
            if(animal == 'c'){
                coelho += qtd;
            }
            if(animal == 'r'){
                rato += qtd;
            }
            if(animal == 's'){
                sapo += qtd;
            }
            cobaias += qtd;
        }
        perCoelho = (float)coelho/cobaias*100;
        perRato = (float)rato/cobaias*100;
        perSapo = (float)sapo/cobaias*100;
        
        System.out.println("Total: " + cobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f%%%nPercentual de ratos: %.2f%%%nPercentual de sapos: %.2f%%%n", perCoelho, perRato, perSapo);
		
		//1094 - RESOLUÇÃO CORRETA
		
		Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
       
        int quantia;
        int qtdRatos = 0, qtdCoelhos = 0, qtdSapos = 0, qtdTotal = 0;
        char tipoCobaia;
        for (int i = 0; i < n; i++) {
            quantia = input.nextInt();
            tipoCobaia = input.next().charAt(0);
           
            switch (tipoCobaia) {
               
                case 'C':
                    qtdCoelhos += quantia;
                    break;
                case 'R':
                    qtdRatos += quantia;
                    break;
                case 'S':
                    qtdSapos += quantia;
                    break;                   
            }
            qtdTotal += quantia;
        }
       
        System.out.println("Total: " + qtdTotal + " cobaias");
        System.out.println("Total de coelhos: " + qtdCoelhos);
        System.out.println("Total de ratos: " + qtdRatos);
        System.out.println("Total de sapos: " + qtdSapos);
       
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ( (double) qtdCoelhos / qtdTotal) * 100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ( (double) qtdRatos / qtdTotal) * 100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ( (double) qtdSapos / qtdTotal) * 100) + " %");
		
		//1095
		
		int i, j;
		for(i=1, j=60; i<60 && j>=0; ){			
			System.out.println("I=" + i + " J=" + j);
			i+=3;
			j-=5;
		}
		
		//1096
		
		for(int i=1; i<=9; ){			
			for(int j=7; j>=5; ){
				System.out.println("I=" + i + " J=" + j);
				
				j--;
			}
			i= i+2;
		}
		
		//1097
		
		int j = 7;
		int a = 0; 
		for(int i=1; i<=9; ){			
			a = j;
			for( ; j>=a-2; ){
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			a += 2;
			j = a;
			i = i+2;
		}
		
		//1098 - RESOLUÇÃO CORRETA
		
		for (float i = 0,j=1,k=0; i<2.1f;j++,k++) {
			
			
			if(k==3){
				i +=0.2f;
				j=1+i;
				k =0;
			}
			if(i<2.1f){
				
				if(i==1 || (i>2 && i<2.1) || i ==0)
					System.out.printf("I=%.0f J=%.0f\n",i,j);
				else
				
				System.out.printf("I=%.1f J=%.1f\n",i,j);
			}
			
		}
		
		//1099
		
		
		
	}
		
		
		
    }
}
