package ar.com.hairapp.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.com.hairapp.enums.Estado;

public class Turno extends Entidad{
	private LocalDateTime fecha_atencion;
	private String detalle;
	private Estado estadoPago;
	private Cliente cliente;
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
