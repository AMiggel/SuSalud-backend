package seguridadvitarrico.backend.rest.sistema.sesion;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import seguridadvitarrico.backend.dominio.sistema.sesion.dto.LoginDto;
import seguridadvitarrico.backend.dominio.sistema.sesion.servicio.SesionService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/sesion")
public class SesionRestController {

	@Autowired
	private SesionService SesionService;

	@PostMapping
	public ResponseEntity<?> autenticacion(@Valid @RequestBody LoginDto loginDto) {
		return SesionService.autenticacion(loginDto);
	}

}
