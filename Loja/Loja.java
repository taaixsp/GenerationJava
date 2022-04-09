package exercicioloja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
	String produto1 ="Caderno";
	String produto2 = "Caneta";
	String produto3 ="Lápis";
	
	ArrayList<String> produtos = new ArrayList<>();
	produtos.add(produto1);
	produtos.add(produto2);
	produtos.add(produto3);
	
	System.out.println("Lista de produtos: = "+ produtos);
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Voce deseja adcionar ou remover? Digite 1 para adcionar e 2 par remover");
	int num= leia.nextInt();
	
	if(num == 1){
			System.out.println("Nome do produto: ");
			String produto = leia.next();
			produtos.add(produto);
	}
	else if(num == 2){
			System.out.println("Qual produto você gostaria de remover:");
			int quantidade = produtos.size();
		//	System.out.println(quantidade);
			for(int i = 0; i< quantidade; i ++) {
				System.out.println((i + 1) +produtos.get(i));
			}
			System.out.println("Digite o número correspondente ao produto: ");
			int numProduto = leia.nextInt();
			produtos.remove(numProduto - 1);
			System.out.println();
			System.out.println("A nova lista é: " + produtos);
	}
	else { 
		System.out.println("Opção inválida");
	}
	Collections.sort(produtos);
	System.out.println("Produtos" + produtos);
	
	
	}
	
}

