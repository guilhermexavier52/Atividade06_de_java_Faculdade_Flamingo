package exercicio06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			// Inicialize as variáveis para armazenar o maior e o menor números
	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;

	        // Faça um loop para ler os cinco números
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o " + (i+1) + "º número: ");
	            int numero = sc.nextInt();

	            // Verifique se o número é maior que o atual maior número
	            if (numero > maior) {
	                maior = numero;
	            }

	            // Verifique se o número é menor que o atual menor número
	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        // Após o loop, imprima o maior e o menor números
	        System.out.println("O maior número é: " + maior);
	        System.out.println("O menor número é: " + menor);

			
			
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		
		sc.close();
	}
	
	
}
