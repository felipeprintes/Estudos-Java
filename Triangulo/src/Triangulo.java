import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		int l1, l2, l3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("entre com l1: ");
		l1 = in.nextInt();
		System.out.println("entre com l2: ");
		l2 = in.nextInt();
		System.out.println("entre com l3: ");
		l3 = in.nextInt();
		
		if(l1==l2 && l1==l3 && l2==l3){
			System.out.println("Equilatero");
		}else if(l1==l2 && l1!=l3 || l2==l3 && l2!=l1 || l1==l3 && l1!=l2){
			System.out.println("Isosceles");
		}else{
			System.out.println("escaleno");
		}
		
	}

}
