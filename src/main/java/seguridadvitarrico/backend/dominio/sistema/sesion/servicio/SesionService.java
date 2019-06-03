package seguridadvitarrico.backend.dominio.sistema.sesion.servicio;

import org.springframework.http.ResponseEntity;

import seguridadvitarrico.backend.dominio.sistema.sesion.dto.LoginDto;

public interface SesionService {

	public ResponseEntity<?> autenticacion(LoginDto LoginDto);
	
}
