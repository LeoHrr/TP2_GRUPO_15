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
	public void testValidarCorreo_ConUnNumero_retornaTrue() {
		String correo = "Test1@dominio.com";
		assertTrue(Email.validarCorreo(correo));
		
	}
	
	@Test
	public void testValidarCorreo_ConTresNumero_retornaTrue() {
		String correo = "1Te2st3@dominio.com";
		assertTrue(Email.validarCorreo(correo));
		
	}
	
	@Test
	public void testValidarCorreo_ConMuchosNumero_retornaTrue() {
		String correo = "129381287932179872198Test32894723984879@dominio.com";
		assertTrue(Email.validarCorreo(correo));
		
	}
	
	@Test
	public void testValidarCorreo_ConSolosNumero_retornaFalse() {
		String correo = "1221321321@1232132231";
		assertFalse(Email.validarCorreo(correo));
		
	}
	
	@Test
	public void testValidarCorreo_SinNumero_retornaFalse() {
		String correo = "Test@dominio.com";
		assertFalse(Email.validarCorreo(correo));

	}
	
	
    @Test
    public void testValidarCorreo_ConLetraMayuscula_retornaTrue() {
    	String ejemploCorreo = "Testing9@dominio.com";
        assertTrue(Email.validarCorreo(ejemploCorreo));
    }

    @Test
    public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
    	String ejemploCorreo = "testing9@dominio.com";
        assertFalse(Email.validarCorreo(ejemploCorreo));
    }
	
    @Test
    public void testValidarCorreo_conAlmenosUnaLetraMinnuscula_retornaTrue() {
    	String ejemploCorreo = "GaSTON97@GMAIL.COM";
        assertTrue(Email.validarCorreo(ejemploCorreo));
    }
    @Test
    public void testValidarCorreo_SinUnaLetraMinnuscula_retornaFalse() {
    	String ejemploCorreo = "GASTON97@GMAIL.COM";
        assertFalse(Email.validarCorreo(ejemploCorreo));
    }
	

}
