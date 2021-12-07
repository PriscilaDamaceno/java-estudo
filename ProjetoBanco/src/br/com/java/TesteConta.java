package br.com.java;

public class TesteConta {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();

		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.50;
		contaCorrente.cliente.nome = "Priscila";
		contaCorrente.cliente.idade  = 27;

		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Luna";
		contaPoupanca.cliente.idade = 25;

		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 55;
		contaInvestimento.cliente.nome = "Sayori";
		contaInvestimento.cliente.idade = 19;
	
	System.out.println(contaInvestimento.numero);
	System.out.println(contaInvestimento.cliente.nome);
	System.out.println(contaInvestimento.saldo);
	}
}
