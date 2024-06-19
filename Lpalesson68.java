package LPAlore;

import java.util.Scanner;

public class Lpalesson68 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int número;
		int i = 1;

		while (i <= 20) {
			System.out.println("Informe o " + i + " Número de Usuário");
			número = ler.nextInt();
			String mensagem = número >= 8 ? "Maior que 8" : "Menor do que 8";
			System.out.println(mensagem);
			i++;

		}
		ler.close();

	}
}