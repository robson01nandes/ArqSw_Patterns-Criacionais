package exercicio2_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogArquivo implements FabricaLog {
	
	BufferedWriter writer = null;
	String[] numeros = new String[10];

	@Override
	public String logar(String escolha) {
		File file = new File("C:\\Users\\Auguston\\git\\arqsw\\aula07\\appClientModule\\exercicio2_3\\log.txt");
		if(escolha.equals("arquivo")) {
			try {
				writer = new BufferedWriter(new FileWriter(file));
				for (int i = 1; i <= 10; i++) {
					writer.write(i+"");
					numeros[i-1] = i+"";
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return numeros.toString();
	}

}
