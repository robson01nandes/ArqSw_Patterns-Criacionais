package exercicio2_3;

public class Run {

	public static void main(String args[]) {
		FabricaLog factory = new LogConsole();
		factory.logar("console");

		factory = new LogArquivo();
		factory.logar("arquivo");
	}

}
