package exercicio06;

import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite um valor Inteiro: ");
			int numero = sc.nextInt();
			
			if (numero < 0) {
				numero = numero * -1;
			}
		  System.out.println("O valor absoluto do fornecido é: "+ numero);
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido.");
		}
		
		
		sc.close();
	}
	
}
