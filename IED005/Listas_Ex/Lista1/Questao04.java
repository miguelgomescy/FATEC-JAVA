package Lista1;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double lado1 = 0;
		double lado2 = 0;
		double lado3 = 0;

		
		System.out.println("Abaixo você ira digitar 3 valores de um triângulo");
		
		
		System.out.println("Digite o primeiro valor");
		lado1 = scanner.nextDouble();
		System.out.println("Você digitou: " + lado1 );
		
		System.out.println(" ");
		System.out.println("Digite o segundo valor:");
		lado2 = scanner.nextDouble();
		System.out.println("Você digitou: " + lado2);

		System.out.println(" ");
		System.out.println("Digite o terceiro valor:");
		lado3 = scanner.nextDouble();
		System.out.println("Você digitou: " + lado3);
		
		
		if(lado1 == lado2 && lado2==3) {
			System.out.println("Este triângulo é equilátero");
		}
		
		else {
			System.out.println("Este triângulo não é equilátero");
		}
		
	}

}
