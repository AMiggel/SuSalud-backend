package seguridadvitarrico.backend.dominio.test.servicio;

import seguridadvitarrico.backend.dominio.test.dto.TestDto;

public interface TestServicio {

	public void ingresarTest(TestDto testDto);
	
	public void borrarTest(int idTest);
	
}
