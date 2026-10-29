package ar.com.hairapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
	private String apodo;
	private int telefono;
	private List<Turno>turnos;
	

	public Cliente(Integer id, String email, String password, String userName, String nombre, String apellido, String apodo, int telefono, List<Turno> turnos) {
		super(id, email, password, userName, nombre, apellido);
		this.apodo = apodo;
		this.telefono = telefono;
		this.turnos = turnos;
		this.turnos = new ArrayList<Turno>();
	}


	//TODO: Metodo que refiere a un recordatorio de turno tanto a un usuario peluquero, como cliente.
	public void recordarTurno() {
		
	}
}
