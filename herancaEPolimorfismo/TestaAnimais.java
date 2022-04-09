package herancaEPolimorfismo;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro Dog = new Cachorro ();
		Cavalo Horse = new Cavalo ();
		Preguiça Sloth = new Preguiça ();
		
		Dog.setNome("Almofadinhas");
		Dog.setIdade(10);
		Dog.setSom("Au Au");
		
		Horse.setNome("Bicuço");
		Horse.setIdade(7);
		Horse.setSom("Relinchar...");
		
		Sloth.setNome("Flecha");
		Sloth.setIdade(23);
		Sloth.setSom("Gritar...");
		
		System.out.println("Nome do cachorro: "+ Dog.getNome());
		System.out.println("Idade do cachorro: "+ Dog.getIdade());
		System.out.println("Som do cachorro: "+ Dog.getSom());
		Dog.correr();
		System.out.println();
	
		System.out.println("Nome do cavalo: "+ Horse.getNome());
		System.out.println("Idade do cavalo: "+ Horse.getIdade());
		System.out.println("Som do cavalo: "+ Horse.getSom());
		Horse.correr();
		System.out.println();
		
		System.out.println("Nome da preguiça: "+ Sloth.getNome());
		System.out.println("Idade da preguiça: "+ Sloth.getIdade());
		System.out.println("Som da preguiça: "+ Sloth.getSom());
		Sloth.subirEmArvores();
		System.out.println();
	}

}
