package exercicio06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			 System.out.println("Digite a primeira nota:");
	            double nota1 = sc.nextDouble();

	            System.out.println("Digite a segunda nota:");
	            double nota2 = sc.nextDouble();

	            System.out.println("Digite a terceira nota:");
	            double nota3 = sc.nextDouble();

	            System.out.println("Digite a quarta nota:");
	            double nota4 = sc.nextDouble();

	            // Calcular a média
	            double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

	            // Verificar se o aluno foi aprovado
	            if (media >= 7.0) {
	                System.out.println("O aluno foi aprovado com média: " + media);
	            } else {
	                System.out.println("A média do aluno é: " + media);
	                System.out.println("Digite a nota do exame:");
	                double notaExame = sc.nextDouble();

	                // Calcular a nova média com o exame
	                double novaMedia = (media + notaExame) / 2.0;

	                // Verificar se o aluno foi aprovado no exame
	                if (novaMedia >= 5.0) {
	                    System.out.println("O aluno foi aprovado em exame com média: " + novaMedia);
	                } else {
	                    System.out.println("O aluno não foi aprovado com média: " + novaMedia);
	                }
	            }
			
			
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		
		sc.close();
	}
}
