import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		
		System.out.println("Entre com o primeiro cateto: ");
		t1.setCat1(in.nextInt());
		
		System.out.println("Entre com o segundo cateto: ");
		t1.setCat2(in.nextInt());
		
		System.out.println("Entre com a hipotenusa: ");
		t1.setHipo(in.nextInt());
		
		if(t1.getHipotenusa(t1.getCat1(), t1.getCat2())== false){
			System.out.println("Nao e um triangulo retangulo");
		}else{
			System.out.println("E um triangulo retagulo");
		}
		
		
		/* hipo² = cat1² + cat2² */
		
	}
	
}
