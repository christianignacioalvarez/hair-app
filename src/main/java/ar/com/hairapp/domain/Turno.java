package ar.com.hairapp.domain;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.com.hairapp.enums.Estado;
import ar.com.hairapp.helpers.ValidationUtils;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TURNOS")
public class Turno extends Entidad{
	
	public static final String ERROR_DATE_OBLIGATORIO = "La fecha del turno es obligatorio";
	public static final String ERROR_DATE_PASADO = "La fecha del turno no puede ser una fecha pasada";
	public static final String ERROR_DATE_FERIADOS = "La peluquería permanece cerrada los lunes y domingos";
	public static final String ERROR_DATE_HORARIO_ATENCION = "El horario de atención es de 09:00hs a 18:00hs";
	
	public static final String ERROR_DETALLE_MAX_LONGITUD = "El detalle del turno no puede superar %d cantidad de caracteres";
	public static final int DETALLE_MAX_LENGHT = 255;
	
	@Column(name = "FECHA_ATENCION")
	private LocalDateTime fecha_atencion;
	
	@Column(name = "DETALLE")
	private String detalle;
	
	@Column(name = "ESTADO")
	@Enumerated(EnumType.STRING)
	private Estado estadoPago;
	 
	private Cliente cliente;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "TURNO_ID", referencedColumnName = "ID", nullable = false)
	private List<ItemTurno>itemsTurno; 
	
	//Solo para Hibernate
	Turno(){
		
	}
	
	public Turno(LocalDateTime fecha_atencion, String detalle) {
		super();
		this.setFecha_atencion(fecha_atencion);
		this.setDetalle(detalle);
	}
	
	public Turno(LocalDateTime fecha_atencion, String detalle, Estado estadoPago) {
		super();
		this.setFecha_atencion(fecha_atencion);
		this.setDetalle(detalle);
		this.estadoPago = estadoPago;
		this.itemsTurno = new ArrayList<ItemTurno>();
	}


	private void setFecha_atencion(LocalDateTime fecha_atencion) {
		if(fecha_atencion == null) {
			throw new IllegalArgumentException(ERROR_DATE_OBLIGATORIO);
		}
		
		LocalDateTime ahora = LocalDateTime.now();
		int hora = fecha_atencion.getHour();
		
		if (fecha_atencion.isBefore(ahora)) {
			// 1. No permitir pasado
	        throw new IllegalArgumentException(ERROR_DATE_PASADO);
	    } else if(fecha_atencion.getDayOfWeek() == DayOfWeek.MONDAY || fecha_atencion.getDayOfWeek() == DayOfWeek.SUNDAY) {
	    	// 2. Validar día de descanso (Ej: Lunes y Domingos cerrado)
	    	throw new IllegalArgumentException(ERROR_DATE_FERIADOS);
	    } else if (hora < 9 || hora >= 20) {
	    	// 3. Validar horario comercial (Ej: 09:00 a 18:00)
	            throw new IllegalArgumentException(ERROR_DATE_HORARIO_ATENCION);
		}
		
		this.fecha_atencion = fecha_atencion;
	}

	private void setDetalle(String detalle) {
		if(ValidationUtils.tieneMasDe(detalle, DETALLE_MAX_LENGHT)) {
			throw new IllegalArgumentException(String.format(ERROR_DETALLE_MAX_LONGITUD, DETALLE_MAX_LENGHT));
		}
		this.detalle = detalle;
	}

	private void setEstadoPago(Estado estadoPago) {
		this.estadoPago = estadoPago;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private void setItemsTurno(List<ItemTurno> itemsTurno) {
		this.itemsTurno = itemsTurno;
	}
	
	

	public static String getErrorDateObligatorio() {
		return ERROR_DATE_OBLIGATORIO;
	}

	public static String getErrorDatePasado() {
		return ERROR_DATE_PASADO;
	}

	public LocalDateTime getFecha_atencion() {
		return fecha_atencion;
	}

	public String getDetalle() {
		return detalle;
	}

	public Estado getEstadoPago() {
		return estadoPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemTurno> getItemsTurno() {
		return itemsTurno;
	}

	//TODO: Desarrollar logica de estado de pago
	public Estado evaluarPago() {
		return estadoPago;
		
	}
}
