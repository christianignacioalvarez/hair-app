package ar.com.hairapp.domain.Items;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SERVICIOS")
public class Servicio extends ItemCatalogo {
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "ANOTACIONES")
	private String anotacion;
	
	@OneToMany()
	@JoinColumn(name = "SERVICIO_ID", referencedColumnName = "ID", nullable = true)
	private List<Producto>productos;

	//Solo para Hibernate
	Servicio(){
		
	}

	public Servicio(double precio, String tipo, String anotacion, List<Producto> productos) {
		super(precio);
		this.tipo = tipo;
		this.anotacion = anotacion;
		this.productos = productos;
	}


	@Override
	public double getPrecio() {
		return super.getPrecio();
	}
	
}
