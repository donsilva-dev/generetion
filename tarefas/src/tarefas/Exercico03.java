package tarefas;

import java.util.Scanner;

public class Exercico03 {
	/*
	 * 5) Com base na tabela abaixo, escreva um algoritmo em Java que leia o código
	 * de um item (número inteiro de 1 a 6) e a quantidade comprada deste item
	 * (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do
	 * produto que foi comprado.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Codigo Produto: ");
		int codigoProduto = sc.nextInt();

		System.out.println();

		System.out.print("Quantidade: ");
		Integer quantidade = sc.nextInt();

		double valorTotal = 0;
		String produto;

		switch (codigoProduto) {
		case 1: {

			produto = "Cachorro Quente";
			valorTotal = quantidade * 10.00;
			
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: %.2f%n", valorTotal);
			

		}
		default:

			sc.close();
		}
	}

}
