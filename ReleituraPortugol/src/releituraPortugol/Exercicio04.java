/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: */

package releituraPortugol;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int A, B, C, D, R, S;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite o valor de A: ");
		A = read.nextInt();
		System.out.println("Digite o valor de B: ");
		B = read.nextInt();
		System.out.println("Digite o valor de C: ");
		C = read.nextInt();
		
		R = (A+B) * (A+B);
		System.out.println("O valor de R �: " + R);
		
		S = (B+C) * (B+C);
		System.out.println("O valor de S �: " + S);
		
		D = (R+S)/2;
		System.out.println("O valor de D �: " + D);
		
		read.close();

	}

}
