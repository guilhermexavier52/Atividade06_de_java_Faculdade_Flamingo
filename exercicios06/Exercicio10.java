package exercicio06;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite um valor entre 1 e 9: ");
	        int valor = sc.nextInt();

	        if (valor >= 1 && valor <= 9) {
	            System.out.println("O valor está na faixa permitida.");
	        } else {
	            System.out.println("O valor está fora da faixa permitida.");
	        }

		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		
		
		
		sc.close();
		
	}
	

}
