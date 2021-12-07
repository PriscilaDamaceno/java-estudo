package br.com.generation.laco.dowhile;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println("O valor da variavel é: " + i);
			i++;
			Thread.sleep(1000);
		   } while(i <= 10);

	}

}
