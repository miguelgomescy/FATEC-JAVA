package Lista1;

import java.util.Scanner;

public class Questão07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int idade = 0;
		
		System.out.println("Olá! Vamos ver sua situação eleitoral =D\nInsira sua idade");
		idade = scanner.nextInt();
		
		System.out.println("Sua idade é: " + idade + "\nCalculando...\n ");
		
		if (idade<16) {
			System.out.println("Você ainda não possui idade suficiente para votar");
		}
		else if (idade >= 18 && idade <= 70 ) {
			System.out.println("Você é obrigado a votar.");
		}
		
		else {
			System.out.println("Seu voto é facultativo. \nIsto é, seu voto é opcional");
		}

	}


}
