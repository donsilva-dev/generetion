package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho: ");
		String caminho = sc.nextLine();

		File file = new File(caminho);
		
		boolean sucess = new File(caminho + "\\subpasta").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucess);

		// Listar diretorio
		File[] diretorio = file.listFiles(File::isDirectory);

		// criar um laço de reptição para percorrer esses diretorios.
		for (File x : diretorio) {
			System.out.println("Novo diretorio: ");
			System.out.println(x);
		}

		System.out.print("\nEntre com o caminho do diretorio eo arquivo a ser criado com extensão .TXT: ");
		caminho = sc.nextLine();

		System.out.print("Informe o número para a tabuada: ");
		int n = sc.nextInt();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
			PrintWriter gravarArq = new PrintWriter(bw);

			gravarArq.println("+--Resultado--+");

			for (int i = 1; i <= 10; i++) {
				gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
			}

			gravarArq.println("+-------------+");
			System.out.println("\nTABUADA DO " + n + " FOI GRAVADA COM SUCESSO!");

			System.out.println("Caminho do arquivo: " + file.getParent());
			System.out.println("Caminho completo: " + caminho);

		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}