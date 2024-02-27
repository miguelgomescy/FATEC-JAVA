package Lista1;

import java.util.Scanner;

public class Questão05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor1 = 0;
		double valor2= 0;
		
		System.out.println("Olá! \nDigite abaixo dois valores para realizar uma comparação");
		System.out.println(" ");
		
		System.out.println("Insira o primeiro valor");
		valor1 = scanner.nextDouble();
		System.out.println("Você digitou: " + valor1);
		
		System.out.println(" \nInsira o segundo valor ");
		valor2 = scanner.nextDouble();
		System.out.println("Você digitou: " + valor2);
		
		System.out.println("Comparando... \n ");
		
		if(valor1>valor2) {
			System.out.println("O Primeiro valor (" + valor1 + ") é maior que Segundo valor (" + valor2 + ")" );
		}
		if(valor2>valor1) {
			System.out.println("O Segundo valor (" + valor2 + ") é maior que o Primeiro valor (" + valor1 + ")" );
		}
		else if(valor1==valor2) {
			System.out.println("Valores Iguais!");
		}
	}

}
