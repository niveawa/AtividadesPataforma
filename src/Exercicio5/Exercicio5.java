package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		double notas, peso, n1, n2, n3;
		double media;
		Scanner ler = new Scanner (System.in);
			System.out.println("colque sua primeira nota");
			n1=ler.nextInt();
			System.out.println("colque sua segunda nota");
			n2=ler.nextInt();
			System.out.println("colque sua terceira nota");
			n3=ler.nextInt();
			
			notas= n1*2 + n2*3 + n3*3 ;
			media= notas/10;
					
					System.out.println("A media é... "+ media );
				
	}

}
