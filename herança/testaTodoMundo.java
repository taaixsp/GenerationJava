package br.com.generation.heranca;

public class testaTodoMundo {

	public static void main(String[] args) {
		Professor pf1 = new Professor();
		Aluno Aluno1 = new Aluno();
		
		pf1.setNomePessoa("Vagner");
		pf1.setEndereco("Rua Pangaré, 303");
		pf1.setIdade(35);
		pf1.setSalario(10000.0);
		pf1.setDisciplina("Lógica de Programação");
		
		Aluno1.setNomePessoa("Tainã");
		Aluno1.setEndereco("Av. Manoel Pedro Pimentel, 200");
		Aluno1.setIdade(29);
		Aluno1.setCursoAluno("Lógica de Programação");
		Aluno1.setSemestreAluno("1º");
		
		System.out.println("Nome: " + pf1.getNomePessoa());
		System.out.println("Endereço: " + pf1.getEndereco());
		System.out.println("Idade: " + pf1.getIdade());
	}

}
