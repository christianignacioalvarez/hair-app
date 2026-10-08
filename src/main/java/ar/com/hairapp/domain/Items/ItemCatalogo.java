package ar.com.hairapp.domain.Items;
import ar.com.hairapp.domain.Entidad;

public abstract class ItemCatalogo extends Entidad {

	private double precio;
	
	public abstract double getPrecio();
}
