package seguridadvitarrico.backend.dominio.sistema.registro.servicio;

import seguridadvitarrico.backend.dominio.sistema.exception.SistemaException;
import seguridadvitarrico.backend.dominio.sistema.registro.dto.UsuarioDto;

public interface RegistroServicio {

	public void registrarUsuario(UsuarioDto UsuarioDto) throws SistemaException;	
	
}
