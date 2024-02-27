package Aulas;

import java.util.Scanner;

public class Aula02_Ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		
		do {
		System.out.println("Digite um número inteiro: ");
		num = scanner.nextInt();
		System.out.println("Você digitou o número: " + num );
		System.out.println(" ");
		total += num;
		System.out.println(total);
		scanner.close();
		}while(num!=0);

	}

}
