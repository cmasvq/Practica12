package Ejercicio_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			contarConsonantes("pesos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void contarConsonantes(String nombreFichero) throws IOException {
		
		File file = new File(nombreFichero);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		int contador = 0;
		
		while(br.read()!= -1) {
			if((char)br.read() != 'a' ||(char)br.read() != 'e' || (char)br.read()!='i'||(char)br.read()!='o'||(char)br.read()!='u') {
				contador++;
			}
		}
		System.out.println(contador);
		
	}
	
	
}
