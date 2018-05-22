package exercicio2_1;

public class Run {
	
	public static void main(String[] args) {
		
		FabricaNome factory = new FabricaNomeEspaco();
		Nome nome = factory.fazNome("Otávio Augusto");
		System.out.println(nome);
		
		factory = new FabricaNomeVirgula();
		nome = factory.fazNome("Augusto, Otávio");
		System.out.println(nome);
	}

}
