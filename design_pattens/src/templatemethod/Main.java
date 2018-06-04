package templatemethod;

/**
 * 
 * @author Igor Almeida | RA: 81617543
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		ManipuladorAbstrato manipulador;

		System.out.println("Mai�sculo");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("Min�sculo.");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("Duplica.");
		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("Inverte.");
		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}
