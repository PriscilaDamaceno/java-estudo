package br.com.generation.laco.repeticao;

public class ExemploWhile01 {

	public static void main(String[] args)  throws InterruptedException {
		int contador =0;
		
		while(contador <=10) {
			System.out.println("Repeti��o nr: " + contador);
			contador++;
			Thread.sleep(500);      /*comando para controlar o tempo de 
								exibi��o dos numero no console*/
		
		}

		
		
	}

}
