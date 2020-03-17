import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		
		int caso, x, y;
		double div = 0;
		caso = ent.nextInt();
		
		for(int i=0; i<caso; i++){
			x=ent.nextInt();
			y=ent.nextInt();
			
			div = x/y;
			System.out.printf("%.2f",div);
		}
		
	}
}
