package ar.com.hairapp.domain;

import java.time.LocalDateTime;

import ar.com.hairapp.enums.Estado;

public class Admin extends Entidad{
	private String email;
	private String userName;
	private String nombre;
	
	
	public Admin(String email, String userName, String nombre) {
		super();
		this.email = email;
		this.userName = userName;
		this.nombre = nombre;
	}

	public void registrarCliente(Cliente cliente) {
		
	}
	
	public void eliminarCliente(int id) {
			
		}
	
	public void modificarCliente(String apodo, int id) {
		
	}
	
	public void registrarTurno(Cliente cliente, LocalDateTime horarioDia, String detalle, Estado estadoPago) {
		
	}
}
