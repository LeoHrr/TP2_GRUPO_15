package packageTest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmailTest {

	@Test
	public void testValidarCorreo_OchoDigitos_retornaTrue() {
		
		String ejemploCorreo ="ejemplo@gmail.com";	
		int digitos = ejemploCorreo.length();

		
		assertTrue(digitos>=8, "El correo tiene menos de 8 digitos.");
	}
	
	@Test
	public void testValidarCorreo_OchoDigitos_retornaFalse() {
		
		String ejemploCorreo2 ="correo";				
		int digitos = ejemploCorreo2.length();
		
		assertFalse(digitos>=8, "El correo tiene 8 digitos o más.");
	}

}
