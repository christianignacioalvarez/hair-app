package ar.com.hairapp.services;

import ar.com.hairapp.domain.Usuario;

public interface UsuarioService {
	
	public void guardar(Usuario usuario);
	
	public boolean existeUsuario(String email);
}
