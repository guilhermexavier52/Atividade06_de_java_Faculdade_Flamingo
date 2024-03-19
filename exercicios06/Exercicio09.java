package exercicio06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero inteiro: ");
			int numero=sc.nextInt();
			
			if(numero % 2 == 0) {
	            System.out.println("O número " + numero + " é par.");
	        } else {
	            System.out.println("O número " + numero + " é ímpar.");
	        }
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
			
			
		}
		
		
		
		
		sc.close();
	}
	
	
}
