package exercicio2;

import java.util.Scanner;

public class idade2 {
	
	public static void main(String[] args) {
		int totaldias,anos,meses,dias;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Escreva quantod dias você viveu...");
			totaldias = entrada.nextInt();
		}
		anos = totaldias / 365;
		meses = (totaldias%365)/30;
		dias = (totaldias%365)%30;
		
		System.out.printf("\n Você viveu: %d ano(s), %d mes(es) e %d dia(s)",anos,meses,dias);

	}

}
