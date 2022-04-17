/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package releituraPortugol;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int anos, meses, dias, totalDias, diasAno, diasMeses;
		System.out.println("Digite sua idade com anos, meses e dias.");
		System.out.println("Anos: ");
		anos = read.nextInt();
		System.out.println("Meses: ");
		meses = read.nextInt();
		System.out.println("Dias: ");
		dias = read.nextInt();
		
		diasAno = anos*365;
		diasMeses = meses*30;
		totalDias = dias+diasAno+diasMeses;
		
		System.out.println("O total de dias de vida é de: " + totalDias);
		read.close();
	}

}
