package ar.com.hairapp.domain;

import static org.assertj.core.api.Assertions.catchIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class UsuarioEntityTest {
	
	@Test
	public void testCrearUsuarioExitosamente() {
		Usuario usuario = new Usuario("ejemplo1@gmail.com", "sdfsdfsf", "test1", "Horacio", "Fernandez");
	
		assertEquals("ejemplo1@gmail.com", usuario.getEmail());
		assertNotNull(usuario.getUserName());
		assertNotNull(usuario.getNombre());
	}
	
	@Test
	public void testCrearUsuarioConMailNulo() {
		try{
			new Usuario(null, "sdfsdfsf", "test1", "Horacio", "Fernandez");
			fail("El usuario no deberia poder construirse con un email en nulo");
		}catch(IllegalArgumentException e) {
			//assertEquals(Usuario.ERR_EMAIL_OBLIGATORIO, e.getMessage());
		}
	}
	
	@Test
	public void testCrearUsuarioConEmailVacio() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Usuario("", "sdfsdfsf", "test1", "Horacio", "Fernandez"));
	
		//assertEquals(Usuario.ERR_EMAIL_OBLIGATORIO, ex.getMessage());
	}
}
