package exercicio06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite a primeira nota: ");
			float nota1 = sc.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			float nota2 = sc.nextFloat();
			
			System.out.println("Digite a terceira nota: ");
			float nota3 = sc.nextFloat();
			
			System.out.println("Digite a quarta nota: ");
			float nota4 = sc.nextFloat();
			
			
			double media =(nota1 + nota2 + nota3 + nota4) / 4.0;
			
			if (media >= 6.0) {
				System.out.println("O aluno foi aprovado com a media: " + media);
			}else {
				System.out.println("O aluno foi reprovado com a media" + media);
			}
		} catch (Exception e) {
			System.out.println("Digite notas Validas.");
		}
		
		
		sc.close();
	}
	
}
