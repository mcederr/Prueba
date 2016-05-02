package clases;

import java.util.Date;

public class Solicitud {

	private int numero;
	private String fecha;
	private Cliente cliente = new Cliente();
	private Rodamiento rodamiento = new Rodamiento();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String string) {
		this.fecha = string;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public Rodamiento getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	
}
