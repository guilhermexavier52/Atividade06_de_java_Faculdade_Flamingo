package exercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercico01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int primeiroValor = 0;
            int segundoValor = 0;

            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.println("Digite o primeiro valor: ");
                try {
                    primeiroValor = sc.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um valor inteiro válido.");
                    sc.nextLine(); // Limpar o buffer do scanner
                }
            }

            entradaValida = false;

            while (!entradaValida) {
                System.out.println("Digite o segundo valor: ");
                try {
                    segundoValor = sc.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um valor inteiro válido.");
                    sc.nextLine(); // Limpar o buffer do scanner
                }
            }

            int diferenca;

            if (primeiroValor > segundoValor) {
                diferenca = primeiroValor - segundoValor;
            } else {
                diferenca = segundoValor - primeiroValor;
            }

            System.out.println("A diferença entre o maior e o menor é: " + diferenca);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        } finally {
            sc.close();
        }
    }

}