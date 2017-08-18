package fibonacci;

import java.util.Scanner;

public class Fibo {
	
	public static void main(String[] args) {
		
		int numero;
		int v1 =0;
		int v2 = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com um valor de entrada para a sequencia de fibonacci: ");
		numero = in.nextInt();
		
		for(int i=0; i<numero; i++){
			int soma = v1+v2;
			v1=v2;
			v2=soma;
			System.out.print(soma + " - ");
		}
		
		
	}

}
