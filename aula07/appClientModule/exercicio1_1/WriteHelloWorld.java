package exercicio1_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHelloWorld implements AbstractHelloWorld {
	
	BufferedWriter writer = null;
	
	@Override
	public void printHelloWord() {
		File file = new File("../hello_world.txt");
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write("Hello world");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
