package br.com.java;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.50;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 55;
		
	}
}
