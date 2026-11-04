package ar.com.hairapp.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.com.hairapp.enums.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TURNOS")
public class Turno extends Entidad{
	
	@Column(name = "FECHA_ATENCION")
	private LocalDateTime fecha_atencion;
	
	@Column(name = "DETALLE")
	private String detalle;
	
	@Column(name = "ESTADO") //TODO:completar relacion con enum
	private Estado estadoPago;
	
	@Column(name = "") //TODO:completar relacion
	private Cliente cliente;
	
	@Column(name = "") //TODO:completar relacion
	private List<ItemTurno>itemsTurno; 
	
	public Turno(LocalDateTime fecha_atencion, String detalle) {
		super();
		this.fecha_atencion = fecha_atencion;
		this.detalle = detalle;
	}
	
	public Turno(LocalDateTime fecha_atencion, String detalle, Estado estadoPago) {
		super();
		this.fecha_atencion = fecha_atencion;
		this.detalle = detalle;
		this.estadoPago = estadoPago;
		this.itemsTurno = new ArrayList<ItemTurno>();
	}

	//TODO: Desarrollar logica de estado de pago
	public Estado evaluarPago() {
		return estadoPago;
		
	}
}
