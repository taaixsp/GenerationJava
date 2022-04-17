/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package releituraPortugol;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		int idadeDias, anos, meses, dias;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias.");
		idadeDias = read.nextInt();
		anos = idadeDias/365;
		meses = idadeDias/30;
		dias = (idadeDias%365)/30;
		
		System.out.println("Sua idade é: " + anos + " ano(s) " + meses + " mes(es) " + dias + " dia(s).");
		read.close();
	}

}
