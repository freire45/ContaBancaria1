package br.com.erickfreire.contabancaria1;

import java.util.Scanner;

public class ContaBancariaTeste1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		ContaBancaria1 conta = new ContaBancaria1();
		
		System.out.printf("O nome inicial é: %n", conta.getNome());
		
		System.out.print("Informe seu nome: ");
		nome = entrada.nextLine();
		conta.setNome(nome);
		System.out.println();
		
		System.out.printf("O nome no objeto conta é: %s%n", conta.getNome());
		
	}

}
