package LPAlore;

import java.util.Scanner;

public class Lpalesson63 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int idade;

		for (int i=1; i<=20; i++) {
			System.out.println("Informe a idade da " + i + " pessoa: ");
			idade = ler.nextInt();
			String mensagem = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
			System.out.println(mensagem);
		}
		ler.close();
	}
}