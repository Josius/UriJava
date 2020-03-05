import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

//ESTA COM RUNTIME ERROR

public class Main {

    public static void main(String[] args){

		Scanner ent = new Scanner(System.in);
		
		int di, hi, mi, si, df, hf, mf, sf, ti, tf, resDia, resHora, resMin;
		//System.out.print("Dia ");
		di = ent.nextInt();
		hi = ent.nextInt();
		mi = ent.nextInt();
		si = ent.nextInt();
		//System.out.print("Dia ");
		df = ent.nextInt();
		hf = ent.nextInt();
		mf = ent.nextInt();
		sf = ent.nextInt();
		ti = (di*86400) + (hi*3600) + (mi*60) + si;
		tf = (df*86400) + (hf*3600) + (mf*60) + sf;
		resDia = tf - ti;
		resHora = resDia%86400;
		resMin = resHora%3600;/*
		System.out.println(resDia/86400 + " dia(s)");
		System.out.println(resHora/3600 + " hora(s)");
		System.out.println(resMin/60 + " minuto(s)" );
		System.out.println(resMin%60 + " segundo(s)");*/
		
		if(tf == ti){
			System.out.println(resDia/86400 + " dia(s)");
			System.out.println(resHora/3600 + " hora(s)");
			System.out.println(resMin/60 + " minuto(s)" );
			System.out.println(resMin%60 + " segundo(s)");
		}else{
			System.out.println(resDia/86400 + " dia(s)");
			System.out.println(resHora/3600 + " hora(s)");
			System.out.println(resMin/60 + " minuto(s)" );
			System.out.println(resMin%60 + " segundo(s)");
		}
	}
}
