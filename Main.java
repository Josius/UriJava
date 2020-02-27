import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Main {
 
    public static void main(String[] args){
        
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

    }
}
/*
		System.out.println("NOTAS:");
		System.out.printf("%.0f nota(s) de R$ 100.00%n", nota100);
		System.out.printf("%.0f nota(s) de R$ 50.00%n", nota50);
		System.out.printf("%.0f nota(s) de R$ 20.00%n", nota20);
		System.out.printf("%.0f nota(s) de R$ 10.00%n", nota10);
		System.out.printf("%.0f nota(s) de R$ 5.00%n", nota5);
		System.out.printf("%.0f nota(s) de R$ 2.00%n", nota2);
		System.out.println("MOEDAS:");
		System.out.printf("%.0f moeda(s) de R$ 1.00%n", moeda1);
		System.out.printf("%.0f moeda(s) de R$ 0.50%n", moeda50);
		System.out.printf("%.0f moeda(s) de R$ 0.25%n", moeda25);
		System.out.printf("%.0f moeda(s) de R$ 0.10%n", moeda10);
		System.out.printf("%.0f moeda(s) de R$ 0.05%n", moeda5);
		System.out.printf("%.0f moeda(s) de R$ 0.01%n", moeda01);
*/