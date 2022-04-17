/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor. */

package releituraPortugol;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		double custoFabrica, custoConsumidor, valorImpostos, valorDistribuidor;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite o valor do custo de fábrica: ");
		custoFabrica = read.nextDouble();
		valorDistribuidor = custoFabrica*0.28;
		valorImpostos = custoFabrica*0.45;
		custoConsumidor = custoFabrica+valorDistribuidor+valorImpostos;
		
		System.out.printf("O custo do consumidor é: %.2f", custoConsumidor);
		read.close();

	}

}
