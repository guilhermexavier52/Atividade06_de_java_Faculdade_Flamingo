package exercicio06;

import java.util.Arrays;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			 System.out.println("Digite o valor de A:");
		        int a = sc.nextInt();
		        
		        System.out.println("Digite o valor de B:");
		        int b = sc.nextInt();
		        
		        System.out.println("Digite o valor de C:");
		        int c = sc.nextInt();
		        
		        // Colocando os valores em um array
		        int[] valores = {a, b, c};
		        
		        // Ordenando o array
		        Arrays.sort(valores);
		        
		        // Apresentando os valores em ordem crescente
		        System.out.println("Valores em ordem crescente:");
		        for (int valor : valores) {
		            System.out.println(valor);
		        }
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		
		
		
		
		
		sc.close();
	}
	
	
}
