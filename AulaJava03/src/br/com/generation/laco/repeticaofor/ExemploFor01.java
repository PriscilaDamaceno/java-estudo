package br.com.generation.laco.repeticaofor;

public class ExemploFor01 {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Vai Brasil: " + i);
			Thread.sleep(1000);
		}

	}

}
