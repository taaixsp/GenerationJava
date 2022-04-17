/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: */

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
		System.out.println("O valor de R é: " + R);
		
		S = (B+C) * (B+C);
		System.out.println("O valor de S é: " + S);
		
		D = (R+S)/2;
		System.out.println("O valor de D é: " + D);
		
		read.close();

	}

}
