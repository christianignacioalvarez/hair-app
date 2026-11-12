package ar.com.hairapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.hairapp.domain.Usuario;
import ar.com.hairapp.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;

	@Override
	public void guardar(Usuario usuario) {
		this.repositorio.save(usuario);
	}

	@Override
	public boolean existeUsuario(String email) {
		boolean existe = false;
		
		if(email != null) {
			List<Usuario> usuarios = this.repositorio.findByEmail(email);
			existe = !usuarios.isEmpty();
		}
		return false;
	}
}
