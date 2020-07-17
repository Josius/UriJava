import java.util.Scanner;

public class Main {
	
	
	
    public static void main(String[] args){
	    Scanner ent = new Scanner(System.in);
		double nota1, nota2, media;
		int resp;
		boolean flag = true;
		
		do{
		    do{
			    nota1 = ent.nextDouble();
			    if(nota1<0 || nota1>10){
				    System.out.println("nota invalida");
			    }else{
			        flag=false;
			    }
		    }while(flag == true);
            
            flag = true;
		    
		    do{
		        nota2 = ent.nextDouble();
		        if(nota2<0 || nota2>10){
			        System.out.println("nota invalida");
		        }
		        else{
			        media = (nota1+nota2)/2;
			        System.out.printf("media = %.2f\n", media);
			        flag = false;
		        }
		    }while(flag == true);
		    
		    do{
		        System.out.println("novo calculo (1-sim 2-nao)");
    		    resp = ent.nextInt();
    		   
    		    if(resp<1 || resp>2){
		            flag = true;
		        }else{
		            flag = false;
		        }   
		    }while(flag == true);
		}while(resp==1);
	}	
}
