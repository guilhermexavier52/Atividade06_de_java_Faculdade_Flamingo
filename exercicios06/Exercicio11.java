package exercicio06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor inteiro");

		    int numero = sc.nextInt();
		    		
			if(numero <= 3) {
				
				System.out.println("O valor digitado é: " + numero);
				
			}else {
				System.out.println("o valor e maior que 3.");
				
			}
			
		} catch (Exception e) {	
			System.out.println("Digite um valor valido.");
		}
		
		sc.close();
	}
	
	
	
	
}
