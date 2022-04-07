/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
 * informações deste objeto no console.
 * 
 */

package ExercicioObjeto02;

public class testaAviao {

	public static void main(String[] args) {
	Aviao Aviao1 = new Aviao();
	Aviao1.ano = 1960;
	Aviao1.marca = "Boeing";
	Aviao1.modelo = "772";
	Aviao1.imprimir();
	Aviao1.decolar(300);
	System.out.println("A velocidade do avião é: "+ Aviao1.velocidade);
	

	}

}
