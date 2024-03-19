package exercicio06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			   int[] numeros = new int[4]; // Array para armazenar os números
		        
		        // Leitura dos quatro números
		        for (int i = 0; i < 4; i++) {
		            System.out.println("Digite o número " + (i + 1) + ":");
		            numeros[i] = sc.nextInt();
		        }
		        
		     // Apresentar os números divisíveis por 2 e 3
		        System.out.println("Números divisíveis por 2 e 3:");
		        for (int numero : numeros) {
		            if (numero % 2 == 0 && numero % 3 == 0) {
		                System.out.println(numero);
		            }
		        }
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		sc.close();
	}
	
}
