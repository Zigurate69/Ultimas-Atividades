package LPAlore;

import java.util.Scanner;

public class Lpalesson67 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int idade;
		int i = 1;

		while (i <= 20) {
			System.out.println("Informe a idade da " + i + " pessoa: ");
			idade = ler.nextInt();
			String mensagem = idade >= 18? "Maior de Idade" : "Menor de Idade";
			System.out.println(mensagem);
			i++;

		}
		ler.close();

	}
}