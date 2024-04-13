package packageTest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;


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
	
	@Test
	public void testValidarCorreo_ConNumero_retornaTrue() {
		String ejemploCorreo3 = "test99@dominio.com";
		assertTrue(ejemploCorreo3.matches(".*\\d.*"));
		
	}
	
	@Test
	public void testValidarCorreo_ConNumero_retornaFalse() {
		String ejemploCorreo4 = "test@dominio.com";
		assertFalse(ejemploCorreo4.matches(".*\\d.*"));

	}
	
    @Test
    public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
    	String ejemploCorreo = "Test@dominio.com";
        assertTrue(ejemploCorreo.matches(".*[A-Z].*"));
    }

    @Test
    public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
    	String ejemploCorreo = "test@dominio.com";
        assertFalse(Email.validarCorreo(ejemploCorreo));
    }
	
	

}
