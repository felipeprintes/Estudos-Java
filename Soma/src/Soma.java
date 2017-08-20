
public class Soma {
	
	public static void main(String[] args) {
		
		int soma = 0;
		int valorBuscado = 8;
		int n[] = {1,2,5,4};
		int i = 0;
		int j =0;
		
		while (j < n.length){
			
			if(i==j || j<i)
				j = i+1;
			
			soma = n[i] + n[j];
			
			if(soma==valorBuscado){
				System.out.println("Soma encontrada");
				break;
			}else if(soma!=valorBuscado){
				i++;
				j=0;
			}else{
				System.out.println("Soma não encontrada");
				break;
			}
		}
		
		
		
	}
	

}
