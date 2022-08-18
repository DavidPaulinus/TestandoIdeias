package TestingThings;

public class ProblemasPraResolver {

	public static void main(String[] args) {
		
	//found out how to get the bigger and the smaller number of a sequence, with "Integer.MAX_VALUE" and without it	
	//achar o porcentual de impares e pares em uma quantidade indeterminada de valores
	}
	
	
	static int soma(int[] valor) {
		int soma=0;
		for(int valores:valor) {
			soma+=valores;
		}
		return soma;
	}
	
	static int soma(Integer... valor) {
		int soma=0;
		for(int valores:valor) {
			soma+=valores;
		}
		return soma;
	}
	
	//make it work like the other ones
	
	/*static Integer somaArray(ArrayList valor) {
		int soma=0;
		for(int i=0;i<valor;i++) {
			
		}
		
		return soma;
	}*/
	
}
