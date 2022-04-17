/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

package releituraPortugol;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite o valor de A: ");
		a = read.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = read.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = read.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = read.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = read.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = read.nextDouble();
			
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de X é: "+ x);
		System.out.println("O valor de Y é: "+ y);
		read.close();

	}

}
