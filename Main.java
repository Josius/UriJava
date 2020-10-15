import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
	    
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print(a + " " + b + " " + c + " ");
		for(int i = 0; i < n-3; i++){
			a = b+c;
			System.out.print(a + " ");
			c = b;
			b = a;
		}
		System.out.println();
	}
}