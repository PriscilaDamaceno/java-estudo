package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			
			if(numero == 10) {
				System.out.println("Você Acertou!");
			}
			else {
				System.out.println("Você Errou!");
			}
		}

	}

}
