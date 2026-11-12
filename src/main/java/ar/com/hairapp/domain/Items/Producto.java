package ar.com.hairapp.domain.Items;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")
public class Producto extends ItemCatalogo {
	
	@Column(name = "MARCA")
	private String marca;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "VENCIMIENTO")
	private Date vencimiento;
	
	@Column(name = "TONO")
	private Double tono;
	
	@Column(name = "VOLUMEN")
	private Double volumen;
	
	@Column(name = "DETALLE")
	private String detalle;
	
	//Solo para Hibernate
	Producto(){
		
	}
	
	public Producto(double precio, String marca, String nombre, Date vencimiento, double tono,
			double volumen, String detalle) {
		super(precio);
		this.marca = marca;
		this.nombre = nombre;
		this.vencimiento = vencimiento;
		this.tono = tono;
		this.volumen = volumen;
		this.detalle = detalle;
	} 

	
	
	
}
