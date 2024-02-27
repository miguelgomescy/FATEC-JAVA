package Aulas;

import java.util.Scanner;

public class aula02_ex2 {
	public static void main(String[] args) {
		//Imprima o fatorial de um número
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		int fatorial;
		
		System.out.println("Digite um número");
		valor = scanner.nextInt();
		System.out.println("Você digitou o número: " + valor );
		valor *=1;
		System.out.println(valor);
		
		scanner.close();
	}

}
