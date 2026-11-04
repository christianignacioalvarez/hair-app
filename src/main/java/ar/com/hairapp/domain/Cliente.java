package ar.com.hairapp.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente extends Usuario{
	@Column(name = "APODO")
	private String apodo;
	
	@Column(name = "TELEFONO")
	private int telefono;
	
	@Column(name = "#") //TODO: Completar relacion 
	private List<Turno>turnos;
	

	public Cliente(String email, String password, String userName, String nombre, String apellido, String apodo, int telefono, List<Turno> turnos) {
		super(email, password, userName, nombre, apellido);
		this.apodo = apodo;
		this.telefono = telefono;
		this.turnos = turnos;
		this.turnos = new ArrayList<Turno>();
	}


	//TODO: Metodo que refiere a un recordatorio de turno tanto a un usuario peluquero, como cliente.
	public void recordarTurno() {
		
	}
}
