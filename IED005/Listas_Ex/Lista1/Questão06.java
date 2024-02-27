package Lista1;

import java.util.Scanner;

public class Questão06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;
		int contador = 0;

		System.out.println("Olá! \nInsira 3 valores para realizarmos uma comparação "
				+ "\nNesta compração estamos buscando valores negativos");
		
		System.out.println(" \nDigite o primeiro valor");
		valor1 = scanner.nextDouble();
		System.out.println("Você digitou: " + valor1);
		
		System.out.println(" \nInsira o segundo valor ");
		valor2 = scanner.nextDouble();
		System.out.println("Você digitou: " + valor2);
		
		System.out.println(" \nInsira o segundo valor ");
		valor3 = scanner.nextDouble();
		System.out.println("Você digitou: " + valor3);
		
		
		if(valor1<0) {
			contador++;
		}
		if(valor2<0) {
			contador++;
		}
		if(valor3<0) {
			contador++;
		}
		
		System.out.println("Dos números informados, a quantidade de negativos é: " + contador);
		
		
	
		
		
	}

}
