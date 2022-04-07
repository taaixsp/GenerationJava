/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
 * informações deste objeto no console.
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
