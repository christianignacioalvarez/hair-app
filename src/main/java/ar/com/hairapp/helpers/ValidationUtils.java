package ar.com.hairapp.helpers;

public class ValidationUtils {
	
	public static boolean isValidEmail(String email) {
		boolean resultado = false;
		
		if(email != null && !email.isBlank()) {
			resultado = email.contains("@");
		}
		
		return resultado;
	}

	public static boolean tieneMasDe(String texto, int cantidad) {
		boolean resultado = false; 
		
		if(texto != null && !texto.isBlank()) {
			resultado = texto.length() > cantidad;
		}
		
		return resultado;
	}
	
	public static boolean tieneMenosDe(String texto, int cantidad) {
		boolean resultado = false; 
		
		if(texto != null && !texto.isBlank()) {
			resultado = texto.length() < cantidad;
		}
		
		return resultado;
	}
	
	public static boolean isEmpty(String texto) {
		return texto == null || texto.isBlank();
	}
}
