import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
		
		//1002
		/*
		Scanner ent = new Scanner(System.in);
        double raio = ent.nextDouble();
		double n = 3.14159;
		
		double Area = n*Math.pow(raio,2);
		
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
		
		Scanner ent = new Scanner(System.in);
		
		int num = ent.nextInt();
		int horas = ent.nextInt();
		double valorPHora = ent.nextDouble();
		
		double salario = horas*valorPHora;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", num, salario);
    }
}