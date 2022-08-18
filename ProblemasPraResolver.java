package TestingThings;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProblemasPraResolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean loop=true;
		int par=0,impar=0;
		
		//achar o porcentual de impares e pares em uma quantidade indeterminada de valores
		while(loop==true) {
			int num=sc.nextInt();
			
			if(num%2==0) {
				par++;
			}else {
				impar++;
			}
			
			System.out.println("Mais um número? [s]/[n]");
			String resp=sc.next();
			if(resp.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		System.out.println("Porcentagem Par: "+(double)(par*100)/(par+impar)+"%");
		System.out.println("Porcentagem Ímpar: "+(double)(impar*100)/(par+impar)+"%");

		sc.close();
	}

}
