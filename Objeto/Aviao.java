/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as
 * informa��es deste objeto no console.
 * 
 */

package ExercicioObjeto02;

public class Aviao {
	String modelo; 
	String marca;
	int ano;
	int velocidade;
	void imprimir() {
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: "+ ano);
		
	}
	void decolar(int aceleracao) {
		velocidade += aceleracao;
	}
}
