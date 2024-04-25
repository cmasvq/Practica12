package Ejercicio_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
	}
	
	
	
	
	
	public static void pesoTotal() throws IOException {
		
		String nombreFichero = "pesos.txt";
		File file = new File(nombreFichero);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		String partes[] = new String[linea.length()];
		partes[1] = linea;
		
		
		
		
		
	}
	
	
}
