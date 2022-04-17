/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles.*/

package releituraPortugol;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, potenciaX, potenciaY, somaPotencias, d;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor do primeiro ponto: ");
		x1 = read.nextDouble();
		System.out.println("Digite o segundo valor do primeiro ponto: ");
		y1 = read.nextDouble();
		System.out.println("Digite o primeiro valor do segundo ponto: ");
		x2 = read.nextDouble();
		System.out.println("Digite o segundo valor do segundo ponto: ");
		y2 = read.nextDouble();
		
		potenciaX = (x2-x1)*(x2+x1);
		potenciaY = (y2-y1)*(y2+y1);
		somaPotencias = potenciaX+potenciaY;
		d = Math.sqrt(somaPotencias); //Math � a biblioteca e sqrt � a raiz quadrada
		
		System.out.printf("A dist�ncia entre os dois pontos �: %.2f", d);
		read.close();
	}

}
