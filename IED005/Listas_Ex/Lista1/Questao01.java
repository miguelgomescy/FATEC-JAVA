package Lista1;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num = 0;
		double num2 = 0;
		double num3 = 0;
		
		System.out.println("Olá! Digite 3 valores abaixo quando solicitado! =D");
		System.out.println("Digite o primeiro valor:");
		num = scanner.nextDouble();
		System.out.println("Você digitou: " + num);
		
		System.out.println(" ");
		System.out.println("Digite o segundo valor:");
		num2 = scanner.nextDouble();
		System.out.println("Você digitou: " + num2);

		System.out.println(" ");
		System.out.println("Digite o terceiro valor:");
		num3 = scanner.nextDouble();
		System.out.println("Você digitou: " + num3);
		
		double soma = num + num2 + num3;

		
		System.out.println("Valores recebidos com sucesso! \nA soma total desses valores é: " + soma);
	}
}
