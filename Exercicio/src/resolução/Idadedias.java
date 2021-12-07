package resolução;
import java.util.Scanner;
public class Idadedias {

	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		String IdadeDias;
		int IdadeMeses,IdadeAnos;
		String TotaldeDias;
		
		System.out.println("Idade em dias!\n");
		
		System.out.println("Digite anos: \n");
		IdadeAnos = entrada.nextInt();
		
		System.out.println("Digite meses: \n");
		IdadeMeses = entrada.nextInt();
		
		System.out.println("Digite dias: \n");
		IdadeDias = entrada.next();
		
		TotaldeDias = (IdadeAnos * 365) + IdadeMeses*30+IdadeDias;
		
		System.out.println("Idade total em dias " + TotaldeDias);
	}
	
	
}
