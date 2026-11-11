package ar.com.hairapp.domain.Items;
import ar.com.hairapp.domain.Entidad;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "ITEMSCATALOGO")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemCatalogo extends Entidad {
	
	@Column(name = "PRECIO")
	private double precio;
	
	
	public ItemCatalogo(double precio) {
		super();
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	};
}
