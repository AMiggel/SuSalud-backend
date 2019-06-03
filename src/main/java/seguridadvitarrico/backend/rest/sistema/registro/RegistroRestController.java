package seguridadvitarrico.backend.rest.sistema.registro;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import seguridadvitarrico.backend.dominio.sistema.exception.SistemaException;
import seguridadvitarrico.backend.dominio.sistema.registro.dto.UsuarioDto;
import seguridadvitarrico.backend.dominio.sistema.registro.servicio.RegistroServicio;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/registro")
public class RegistroRestController {

	@Autowired
	private RegistroServicio registroServicio;
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public void registrarUsuario(@Valid @RequestBody UsuarioDto usuarioDto) throws SistemaException {
		registroServicio.registrarUsuario(usuarioDto);
	}
	
}
