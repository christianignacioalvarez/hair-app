package ar.com.hairapp.domain;

import ar.com.hairapp.domain.Items.ItemCatalogo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ITEMSTURNO")
public class ItemTurno extends Entidad{
	
	@Column(name = "CANTIDAD")
	private int cantidad;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "") //TODO: completar relacion
	private ItemCatalogo itemCatalogo;
	
	public ItemTurno(int cantidad, ItemCatalogo itemCatalogo) {
		super();
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
