package ar.com.hairapp.domain;

import java.time.LocalDateTime;
import ar.com.hairapp.enums.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIOS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Entidad{
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	//Solo para Hibernate
	Usuario(){
		
	}
	
	public Usuario(String email, String password, String userName, String nombre, String apellido) {
		super();
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
