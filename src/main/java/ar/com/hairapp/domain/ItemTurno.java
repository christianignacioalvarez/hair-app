package ar.com.hairapp.domain;

import ar.com.hairapp.domain.Items.ItemCatalogo;

public class ItemTurno extends Entidad{
	
	private int cantidad;
	private ItemCatalogo itemCatalogo;
	
	public ItemTurno(Integer id, int cantidad, ItemCatalogo itemCatalogo) {
		super(id);
		this.cantidad = cantidad;
		this.itemCatalogo = itemCatalogo;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	//TODO: Desarrollar metodo calcularPrecioItem()
	public double calcularPrecioItem() {
		return 0.0;
	}

}
