package feitocomjeff02;

import java.util.Scanner;

public class feitocomjeff02 {

	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("\nDigite a segunda nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2 ) / 2;
		
		if(media >=6.0) {
			System.out.println("\nAprovado!!" +"\nM�dia: " + media);
		}
		else if (media >= 3.0 && media < 6.0) {
			System.out.println("\nAluno de recupera��o!" +"\nM�dia: " + media);
		}
		
		else {
			System.out.println("\nReprovado!!" +"\nM�dia: " + media);
		}
		
		System.out.println("A m�dia do aluno �: " + media);
		
		
	}
	
}
