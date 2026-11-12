package ar.com.hairapp.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.com.hairapp.enums.Estado;
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
