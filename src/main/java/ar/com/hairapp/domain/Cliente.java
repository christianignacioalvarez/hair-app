package ar.com.hairapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
	private String nombre;
	private String apellido;
	private String apodo;
	private int telefono;
	private List<Turno>turnos;
	
	public Cliente (){
		this.turnos = new ArrayList<Turno>();
	}

	public Cliente(String nombre, String apellido, String apodo, int telefono) {
		super(apodo, apodo, apodo);
		this.nombre = nombre;
		this.apellido = apellido;
		this.apodo = apodo;
		this.telefono = telefono;
		this.turnos = new ArrayList<Turno>();
	}
	
	//TODO: Metodo que refiere a un recordatorio de turno tanto a un usuario peluquero, como cliente.
	public void recordarTurno() {
		
	}
}
