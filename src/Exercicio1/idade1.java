package Exercicio1;

import java.util.Scanner;

public class idade1 {
	
	public static void main (String[]args) {
		int totaldedias, anos, meses, dias;
		
		try (Scanner entrada = new Scanner (System.in)){
			System.out.println("Coloque o total de dias... ");
			totaldedias= entrada.nextInt();
			
		}
		anos=totaldedias/365;
		meses=(totaldedias%365)/30;
		dias=(totaldedias%365)%30;
		
		System.out.printf("\n você tem: %d, anos %d meses e %d dias", anos, meses, dias);
	}

}
