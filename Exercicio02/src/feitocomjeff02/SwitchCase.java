package feitocomjeff02;

import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite uma letra de A e D:");
	String letra = entrada.nextLine();
	
	switch(letra) {
	case "a","A":
		System.out.println("Anny");
	break;
	
	case "b", "B":
		System.out.println("Bruna");
	break;
	case "c", "C":
		System.out.println("Carla");
	break;
	case "d", "D":
		System.out.println("Daniel");
	break;
	default:
		System.out.println("Opção inválida!");
		break;
		
	}
	
	}
}
