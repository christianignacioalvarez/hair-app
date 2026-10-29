package ar.com.hairapp.domain;

import java.time.LocalDateTime;

import ar.com.hairapp.enums.Estado;

public class Usuario extends Entidad{
	private String email;
	private String password;
	private String userName;
	private String nombre;
	private String apellido;
	
	
	public Usuario(Integer id, String email, String password, String userName, String nombre, String apellido) {
		super(id);
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.nombre = nombre;
		this.apellido = apellido;
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
