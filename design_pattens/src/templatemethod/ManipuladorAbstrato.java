package templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Igor Almeida | RA: 81617543
 *
 */
public abstract class ManipuladorAbstrato {

	public final void manipularString() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite algo: ");
		String string = reader.readLine();

		System.out.println("Transformado: " + transformarString(string));
		System.out.println();
	}

	protected abstract String transformarString(String string);
}
