package LPAlore;

import java.util.Scanner;

public class Lpalesson65 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int número;

		for (int i=1; i<=20; i++) {
			System.out.println("Informe o " + i + " Número de Usuário");
			número = ler.nextInt();
			String mensagem = número>= 8 ? "Maior que 8" : "Menor do que 8";
			System.out.println(mensagem);
		}
		ler.close();
	}
}