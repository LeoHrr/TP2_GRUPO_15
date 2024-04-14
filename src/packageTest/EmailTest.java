package packageTest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;


public class EmailTest {
	
	@Test //8 digitos
	public void testValidarCorreo_OchoDigitos_retornaTrue() {		
		String ejemploCorreo ="Ejemplo1@gmail.com";	
		assertTrue(Email.validarCorreo(ejemploCorreo));
	}
	
	@Test //Sin 8 digitos
	public void testValidarCorreo_SinOchoDigitos_retornaFalse() {
		
		String ejemploCorreo ="1@g.com";	
		assertFalse(Email.validarCorreo(ejemploCorreo));
	}
	
	@Test   //Almenos 1 numero
	public void testValidarCorreo_AlmenosUnNumero_retornaTrue() {
		String correo = "Test1@dominio.com";
		assertTrue(Email.validarCorreo(correo));		
	}
	
	@Test  //Sin 1 numero
	public void testValidarCorreo_SinNumero_retornaFalse() {
		String correo = "Test@dominio.com";
		assertFalse(Email.validarCorreo(correo));
	}
	
	@Test  //Test de numeros EXTRA
	public void testValidarCorreo_ConTresNumero_retornaTrue() {
		String correo = "1Te2st3@dominio.com";
		assertTrue(Email.validarCorreo(correo));	
	}
	
	@Test   //Test de numeros EXTRA
	public void testValidarCorreo_ConMuchosNumero_retornaTrue() {
		String correo = "129381287932179872198Test32894723984879@dominio.com";
		assertTrue(Email.validarCorreo(correo));	
	}
	
    @Test  //Almenos 1 Mayuscula
    public void testValidarCorreo_ConLetraMayuscula_retornaTrue() {
    	String ejemploCorreo = "Testing9@dominio.com";
        assertTrue(Email.validarCorreo(ejemploCorreo));
    }

    @Test //Sin Mayuscula
    public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
    	String ejemploCorreo = "testing9@dominio.com";
        assertFalse(Email.validarCorreo(ejemploCorreo));
    }
	
    @Test //Almenos 1 Minuscula
    public void testValidarCorreo_conAlmenosUnaLetraMinnuscula_retornaTrue() {
    	String ejemploCorreo = "GaSTON97@GMAIL.COM";
        assertTrue(Email.validarCorreo(ejemploCorreo));
    }
    
    @Test  //Sin Minuscula
    public void testValidarCorreo_SinUnaLetraMinnuscula_retornaFalse() {
    	String ejemploCorreo = "GASTON97@GMAIL.COM";
        assertFalse(Email.validarCorreo(ejemploCorreo));
    }
	
    @Test //Con Alfanumerico
    public void testValidarCorreo_conAlfanumerico_retornaTrue() {
    	String ejemploCorreo = "uTn2024@GMAIL.COM";
        assertTrue(Email.validarCorreo(ejemploCorreo));
    }
    @Test //Sin Alfanumericos
    public void testValidarCorreo_sinAlfanumerico_retornaFalse() {
    	String ejemploCorreo = "utn@gmail.com";
        assertFalse(Email.validarCorreo(ejemploCorreo));
    }
    

}
