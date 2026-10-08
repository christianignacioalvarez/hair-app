package ar.com.hairapp.domain.Items;

public class Servicio extends ItemCatalogo {
	
	private String tipo;
	private String observacion;
	
	

	public Servicio(String tipo, String observacion) {
		super();
		this.tipo = tipo;
		this.observacion = observacion;
	}



	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
