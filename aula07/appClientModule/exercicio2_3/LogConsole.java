package exercicio2_3;

public class LogConsole implements FabricaLog {

	@Override
	public String logar(String escolha) {
		String[] numeros = new String[10];
		if(escolha.equals("console")) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				numeros[i-1] = i+"";
			}
		}
		return numeros.toString();
	}

}
