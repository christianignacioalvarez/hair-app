package ar.com.hairapp.domain;

import java.time.LocalDateTime;
import ar.com.hairapp.enums.Estado;
import ar.com.hairapp.helpers.ValidationUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIOS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Entidad{
	public static final String ERROR_EMAIL_OBLIGATORIO = "El email es obligatorio";
	public static final String ERROR_EMAIL_MAX_LONGITUD = "El email no puede superar %d cantidad de caracteres";
	public static final String ERROR_EMAIL_INVALID = "El email no tiene un formato valido";
	public static final int EMAIL_MAX_LENGHT = 255;
	
	private static final String ERROR_USERNAME_OBLIGATORIO = "El nombre de usuario es obligatorio";
	private static final String ERROR_USERNAME_MAX_LONGITUD = "El nombre de usuario no puede superar %d cantidad de caracteres";
	private static final int USERNAME_MAX_LENGHT = 50;
	
	private static final String ERROR_PASSWORD_OBLIGATORIO = "La contraseña es obligatoria";
	private static final String ERROR_PASSWORD_MAX_LONGITUD = "La contraseña no puede superar %d cantidad de caracteres";
	private static final int PASSWORD_MAX_LENGHT = 255;
	
	private static final String ERROR_NAME_MAX_LONGITUD = "El nombre no puede superar %d cantidad de caracteres";
	private static final int NAME_MAX_LENGHT = 100;
	
	private static final String ERROR_LASTNAME_MAX_LONGITUD = "El apellido no puede superar %d cantidad de caracteres";
	private static final int LASTNAME_MAX_LENGHT = 100;
	
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
		this.setEmail(email);
		this.setPassword(password);
		this.setUserName(userName);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	private void setEmail(String email) {
		if(ValidationUtils.isEmpty(email)) {
			throw new IllegalArgumentException(ERROR_EMAIL_OBLIGATORIO);
		}else if(ValidationUtils.tieneMasDe(email, EMAIL_MAX_LENGHT)) {
			throw new IllegalArgumentException(String.format(ERROR_EMAIL_MAX_LONGITUD, EMAIL_MAX_LENGHT));
		}else if(!ValidationUtils.isValidEmail(email)) {
			throw new IllegalArgumentException(ERROR_EMAIL_INVALID);
		}
			this.email = email;
	}

	private void setPassword(String password) {
		if(ValidationUtils.isEmpty(password)) {
			throw new IllegalArgumentException(ERROR_PASSWORD_OBLIGATORIO);
		}else if(ValidationUtils.tieneMasDe(password, PASSWORD_MAX_LENGHT)) {
			throw new IllegalArgumentException(String.format(ERROR_PASSWORD_MAX_LONGITUD, PASSWORD_MAX_LENGHT));
		}
		
		this.password = password;
	}

	private void setUserName(String userName) {
		if(ValidationUtils.isEmpty(userName)) {
			throw new IllegalArgumentException(ERROR_USERNAME_OBLIGATORIO);
		}else if(ValidationUtils.tieneMasDe(userName, EMAIL_MAX_LENGHT)) {
			throw new IllegalArgumentException(String.format(ERROR_USERNAME_MAX_LONGITUD, USERNAME_MAX_LENGHT));
		}
		this.userName = userName;
	}

	private void setNombre(String nombre) {
		if(ValidationUtils.tieneMasDe(nombre, NAME_MAX_LENGHT)){
			throw new IllegalArgumentException(String.format(ERROR_NAME_MAX_LONGITUD, NAME_MAX_LENGHT));
		}
		
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		if(ValidationUtils.tieneMasDe(apellido, LASTNAME_MAX_LENGHT)){
			throw new IllegalArgumentException(String.format(ERROR_LASTNAME_MAX_LONGITUD, LASTNAME_MAX_LENGHT));
		}
		
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
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
