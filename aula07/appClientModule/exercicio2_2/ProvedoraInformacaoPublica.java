package exercicio2_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ProvedoraInformacaoPublica implements FabricaProvedoraInformacao {

	@Override
	public String proverInformacao(String senha) {
		String dados = "";
		try {
			File file = new File("C:\\Users\\Auguston\\git\\arqsw\\aula07\\appClientModule\\exercicio2_2\\publico.txt");
			dados = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dados;
	}

}
