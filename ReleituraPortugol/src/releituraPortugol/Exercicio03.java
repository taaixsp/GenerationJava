/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package releituraPortugol;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int duracaoSegundos, duracaoHoras, duracaoMinutos, segundosRestantes, minutosRestantes;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		duracaoSegundos = read.nextInt();
		duracaoMinutos = duracaoSegundos/60;
		minutosRestantes = duracaoMinutos%60;
		segundosRestantes = duracaoSegundos%60;
		duracaoHoras = duracaoMinutos/60;
		
		System.out.println("O evento durou: " + duracaoHoras + " hora(s) " + minutosRestantes + " minuto(s) e " + segundosRestantes + " segundo(s).");
		read.close();
	}

}
