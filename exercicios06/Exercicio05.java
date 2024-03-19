package exercicio06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// Entrada dos coeficientes A, B e C
            System.out.println("Digite o coeficiente A:");
            double A = sc.nextDouble();

            if (A == 0) {
                System.out.println("O coeficiente A deve ser diferente de zero.");
                return; // Encerra o programa se A for igual a zero
            }

            System.out.println("Digite o coeficiente B:");
            double B = sc.nextDouble();

            System.out.println("Digite o coeficiente C:");
            double C = sc.nextDouble();

            // Cálculo do discriminante (Δ)
            double discriminante = B * B - 4 * A * C;

            // Verificação do discriminante para determinar as raízes
            if (discriminante > 0) {
                double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
            } else if (discriminante == 0) {
                double raiz = -B / (2 * A);
                System.out.println("A equação possui uma raiz real: " + raiz);
            } else {
                System.out.println("A equação não possui raízes reais.");
            }
			
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		sc.close();
	}
	
}
