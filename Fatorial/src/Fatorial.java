import java.util.Scanner;

public class Fatorial {

	
	public static void main(String[] args) {
		int num;
		int fat = 1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com um numero para achar seu fatorial: ");
		num = in.nextInt();
		int aux = num;
		for(int i=0; i<=num; i++){
			while(aux!=0){
				fat = fat*aux;
				aux--;	
			}
			
			
		}
		
		System.out.println(fat);
	}
	
}
