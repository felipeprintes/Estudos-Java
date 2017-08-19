
public class Triangulo {

	private double base;
	private double altura;
	private double area;
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		return this.area = (this.altura*this.base)/2;
	}
	
	public void almentaAltura(double valorASerAlmentado){
		if(this.altura<=2){
			this.altura+=valorASerAlmentado;
		}
		
	}
	
	public void almentaBase(double valorASerAlmentado){
		
		if(this.base<=2){
			this.base+=valorASerAlmentado;
		}
		
	}

}
