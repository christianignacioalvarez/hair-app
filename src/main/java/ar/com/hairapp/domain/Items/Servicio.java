package ar.com.hairapp.domain.Items;

import java.util.ArrayList;
import java.util.List;

public class Servicio extends ItemCatalogo {
	
	private String tipo;
	private String observacion;
	private List<Producto>productos;


	public Servicio(String tipo, String observacion) {
		super();
		this.tipo = tipo;
		this.observacion = observacion;//Pensarlo como comentario/anotaciones
		this.productos = new ArrayList<Producto>();
	}


	@Override
	public double getPrecio() {
		return super.getPrecio();
	}
	
}
