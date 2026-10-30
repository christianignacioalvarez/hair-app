package ar.com.hairapp.domain.Items;
import ar.com.hairapp.domain.Entidad;

public abstract class ItemCatalogo extends Entidad {
	private double precio;
	
	
	public ItemCatalogo(double precio) {
		super();
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	};
}
