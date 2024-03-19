package exercicio06;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite o nome: ");
	        String nome = sc.nextLine();

	        System.out.println("Digite o sexo (M para masculino, F para feminino): ");
	        char sexo = sc.next().charAt(0);

	        if (sexo == 'M' || sexo == 'm') {
	            System.out.println("Ilmo Sr. " + nome);
	        } else if (sexo == 'F' || sexo == 'f') {
	            System.out.println("Ilma Sra. " + nome);
	        } else {
	            System.out.println("Sexo não reconhecido.");
	        }
		} catch (Exception e) {
			System.out.println();
		}
		sc.close();
	}

}
