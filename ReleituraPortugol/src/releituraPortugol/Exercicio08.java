/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor. */

package releituraPortugol;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		double custoFabrica, custoConsumidor, valorImpostos, valorDistribuidor;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite o valor do custo de f�brica: ");
		custoFabrica = read.nextDouble();
		valorDistribuidor = custoFabrica*0.28;
		valorImpostos = custoFabrica*0.45;
		custoConsumidor = custoFabrica+valorDistribuidor+valorImpostos;
		
		System.out.printf("O custo do consumidor �: %.2f", custoConsumidor);
		read.close();

	}

}
