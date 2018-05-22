package exercicio2_1;

public class FabricaNomeVirgula implements FabricaNome {

	@Override
	public Nome fazNome(String nome) {
		if(nome.contains(",")) {
			String[] nomes = nome.split(",");
			Nome produtoNome = new Nome(nomes[1].trim(), nomes[0].trim());
			return produtoNome;
		}
		return null;
	}

}
