package ar.com.hairapp.domain.Items;

import java.util.Date;

public class Producto extends ItemCatalogo {
	private String marca;
	private String nombre;
	private Date vencimiento; 
	private double tono;
	private double volumen;
	private String detalle;
	
	
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
