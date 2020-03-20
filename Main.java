import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		double nota1, nota2, media;
		boolean flag = true;
		do{
			nota1 = ent.nextDouble();
			nota2 = ent.nextDouble();
			if((nota1<0 || nota1>10) || (nota2<0 || nota2>10)){
				System.out.println("nota invalida");
			}else{
				media = (nota1+nota2)/2;
				System.out.printf("media = %.2f\n", media);
				flag = false;
			}
		}while(flag == true);
		
	}
}
