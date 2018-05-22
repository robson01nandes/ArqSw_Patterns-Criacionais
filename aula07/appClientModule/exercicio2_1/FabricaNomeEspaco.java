package exercicio2_1;

public class FabricaNomeEspaco implements FabricaNome {

	@Override
	public Nome fazNome(String nome) {
		if(nome.contains(" ")) {
			String[] nomes = nome.split(" ");
			Nome produtoNome = new Nome(nomes[0], nomes[1]);
			return produtoNome;
		}
		return null;
	}

}
