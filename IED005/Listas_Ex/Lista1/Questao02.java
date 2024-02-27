package Lista1;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int mes = 0;
		
		System.out.println("Olá! \nDigite um número de 1 a 12");
		mes = scanner.nextInt();
		if(mes == 1) {
			System.out.println("Mes: 1 | Janeiro");
		}
		else if(mes == 2) {
			System.out.println("Mes: 2 | Fevereiro");
		}
		else if(mes == 3) {
			System.out.println("Mes: 3 | Março");
		}
		else if(mes == 4) {
			System.out.println("Mes: 4 | Abril");
		}
		else if(mes == 5) {
			System.out.println("Mes: 5 | Maio");
		}
		else if(mes == 6) {
			System.out.println("Mes: 6 | Junho");
		}
		else if(mes == 7) {
			System.out.println("Mes: 7 | Julho");
		}
		else if(mes == 8) {
			System.out.println("Mes: 8 | Agosto");
		}
		else if(mes == 9) {
			System.out.println("Mes: 9 | Setembro");
		}
		else if(mes == 10) {
			System.out.println("Mes: 10 | Outubro");
		}
		else if(mes == 11) {
			System.out.println("Mes: 11 | Novembro");
		}
		else if(mes == 12) {
			System.out.println("Mes: 12 | Dezembro");
		}
		
		else   {
		System.out.println("Mes invalido");
		}
		}
		
	}


