package br.com.generation.heranca;

public class testaTodoMundo {

	public static void main(String[] args) {
		Professor pf1 = new Professor();
		Aluno Aluno1 = new Aluno();
		
		pf1.setNomePessoa("Vagner");
		pf1.setEndereco("Rua Pangar�, 303");
		pf1.setIdade(35);
		pf1.setSalario(10000.0);
		pf1.setDisciplina("L�gica de Programa��o");
		
		Aluno1.setNomePessoa("Tain�");
		Aluno1.setEndereco("Av. Manoel Pedro Pimentel, 200");
		Aluno1.setIdade(29);
		Aluno1.setCursoAluno("L�gica de Programa��o");
		Aluno1.setSemestreAluno("1�");
		
		System.out.println("Nome: " + pf1.getNomePessoa());
		System.out.println("Endere�o: " + pf1.getEndereco());
		System.out.println("Idade: " + pf1.getIdade());
	}

}
