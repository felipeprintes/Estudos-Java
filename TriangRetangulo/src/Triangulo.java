
public class Triangulo {

	private double cat1;
	private double cat2;
	private double hipo;
	private double x;
	private double y;
	
	public double getCat1() {
		return cat1;
	}
	
	public void setCat1(double cat1) {
		this.cat1 = cat1;
	}
	
	public double getCat2() {
		return cat2;
	}
	
	public void setCat2(double cat2) {
		this.cat2 = cat2;
	}
	
	public void setHipo(double hipo){
		this.hipo = hipo;
	}
	
	public double getHipo() {
		return hipo;
	}
	
	public boolean getHipotenusa(double cat1, double cat2){
		
		x = cat1*cat1 + cat2*cat2;
		
		y = hipo*hipo;
		
		if(y!=x){
			
			return false;
			
		}else{
			
			return true;
			
		}
		
		
		
		
	}
	
}
