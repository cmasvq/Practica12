package Models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Coche {
	
	private String marca;
	private double peso;
	private String tipoMotor;
	
	public Coche(String marca, double peso, String tipoMotor) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.tipoMotor = tipoMotor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	
}