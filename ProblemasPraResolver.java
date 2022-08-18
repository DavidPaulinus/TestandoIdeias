package TestingThings;

import java.util.Scanner;

public class ProblemasPraResolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// find out how to get the bigger and the smaller number of a sequence with
		// "Integer.MAX_VALUE" and "Integer.MIN_VALUE"

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		System.out.println("Com \"Integer.MAX_VALUE\" e \"Integer.MIN_VALUE\"");
		System.out.println("Sequência de 5 números");
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}

		}
		System.out.println("Menor: " + min);
		System.out.println("Maior: " + max);

		// find out how to get the bigger and the smaller number of a sequence without
		// "Integer.MAX_VALUE" and "Integer.MIN_VALUE"
		Integer maior = null, menor = null;
		Integer CONSTANTE = null;
		
		System.out.println("\nSem \"Integer.MAX_VALUE\" e \"Integer.MIN_VALUE\"");
		System.out.println("Sequência de 5 números");
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();

			if (CONSTANTE == null) {
				CONSTANTE = num;
				maior = CONSTANTE;
				menor = CONSTANTE;
			}

			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}

		}
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);

		sc.close();
	}

}
