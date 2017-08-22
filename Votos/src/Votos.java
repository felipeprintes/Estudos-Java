import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Votos {

	public static void main(String[] args) throws IOException{
		String x = "sim";
		final String resp = "sim";
		Scanner in = new Scanner(System.in);
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		Candidatos c = new Candidatos();
		
		while(resp==x){
			System.out.println("entre com o nome do Candidato: ");
			c.setNome(rd.readLine()) ;
		
			System.out.println("Entre com o numero do candidato: ");
			c.setNumero(in.nextInt());
			
			System.out.println("Responda (sim) ou (nao). Deseja continuar:  ");
			c.setResposta(rd.readLine());
			x = c.getResposta();

		}

	}
	
}


/*BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));  
String linha = rd.readLine(); */

/* if(resp != x){
			System.out.println("respostas diferentes");
		}  */