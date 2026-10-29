package ar.com.hairapp.domain.Items;

import java.util.ArrayList;
import java.util.List;

public class Servicio extends ItemCatalogo {
	
	private String tipo;
	private String anotacion;
	private List<Producto>productos;


	public Servicio(Integer id, double precio, String tipo, String anotacion, List<Producto> productos) {
		super(id, precio);
		this.tipo = tipo;
		this.anotacion = anotacion;
		this.productos = productos;
	}


	@Override
	public double getPrecio() {
		return super.getPrecio();
	}
	
}
