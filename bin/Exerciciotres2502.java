
import  java.util.Scanner ;

public class Exerciciotres2502 {
	public  static  void  main ( String  args []) {
		int idade;
		
		Scanner leia =  new  Scanner (System.in);
		
		System .out. println ( " Digite sua idade: " );
		idade = leia . nextInt ();
		
		if(idade >= 10  && idade <= 14 ){
			System .out. println ( " Voc� � infantil " );
		}
		if(idade >= 15  && idade <= 17 ) {
			System .out. println ( " Voc� � juvenil " );
		}
		if(idade >= 18  && idade <= 25 ) {
			System .out. println ( " Voc� � adulto " );
		}
		System .out. println ( " idade invalidada " );{
			
		}
	}
		
}
