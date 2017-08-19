
public class Principal {
	
	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		t1.setBase(1.0);
		t1.setAltura(1.0);
		
		t1.almentaAltura(4);
		t1.almentaBase(4);
		
		
		
		System.out.println("O valor da Area e: " + t1.getArea());
		System.out.println("O valor da sua Altura e: " + t1.getAltura());
		System.out.println("O valor da sua base e: " + t1.getBase());
		
	}

}
