package Ejercicio_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Models.Coche;

public class Main {

	public static void main(String[] args) {
		
		try {
			generarTresCoches();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			leerCoches();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public static void generarTresCoches() throws IOException {
		Coche coche1 = new Coche(null, 0, null);
		Coche coche2 = new Coche(null, 0, null);
		Coche coche3 = new Coche(null, 0, null);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce  la marca del  primer coche");
		coche1.setMarca(scanner.next());
		System.out.println("Introduce  el peso del primer coche");
		coche1.setPeso(scanner.nextDouble());
		System.out.println("Introduce el tipo de motor del primer coche");
		coche1.setTipoMotor(scanner.next());
		
		System.out.println("Introduce  la marca del segundo coche");
		coche2.setMarca(scanner.next());
		System.out.println("Introduce  el peso del segundo coche");
		coche2.setPeso(scanner.nextDouble());
		System.out.println("Introduce el tipo de motor del segundo coche");
		coche2.setTipoMotor(scanner.next());
		
		System.out.println("Introduce  la marca del tercer coche");
		coche3.setMarca(scanner.next());
		System.out.println("Introduce  el peso del tercer coche");
		coche3.setPeso(scanner.nextDouble());
		System.out.println("Introduce el tipo de motor del tercer coche");
		coche3.setTipoMotor(scanner.next());
		
		
		scanner.close();
		
		
		File file = new File("coches.dat");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Marca del coche 1: " + coche1.getMarca());
		bw.newLine();
		bw.write("Peso del coche 1: " + coche1.getPeso());
		bw.newLine();
		bw.write("Tipo de motor del coche 1: " + coche1.getTipoMotor());
		bw.newLine();
		bw.newLine();
		bw.write("Marca del coche 2: " + coche2.getMarca());
		bw.newLine();
		bw.write("Peso del coche 2: " + coche2.getPeso());
		bw.newLine();
		bw.write("Tipo de motor del coche 2: " + coche2.getTipoMotor());
		bw.newLine();
		bw.newLine();
		bw.write("Marca del coche 3: " + coche3.getMarca());
		bw.newLine();
		bw.write("Peso del coche 3: " + coche3.getPeso());
		bw.newLine();
		bw.write("Tipo de motor del coche 3: " + coche3.getTipoMotor());
		
		bw.close();
		fw.close();
		
	}
	
	
	public static void leerCoches() throws IOException {
		
		String nombreFichero = "coches.dat";
		File file = new File(nombreFichero);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Estos son los coches almacenados: ");
		while(br.read() != -1)
		System.out.println(br.readLine());
		
		br.close();
		fr.close();
		
	}

}