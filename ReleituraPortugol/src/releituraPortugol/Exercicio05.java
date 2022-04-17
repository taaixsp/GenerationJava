/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package releituraPortugol;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = read.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = read.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = read.nextDouble();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		System.out.println("A média final é:  " + media);
		read.close();

	}

}
