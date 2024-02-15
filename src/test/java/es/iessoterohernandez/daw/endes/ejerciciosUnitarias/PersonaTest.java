package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	private static Persona persona;
	
	@BeforeEach
    public void setUp() {
        persona = new Persona("David", 18, 'H', 92, 1.78);
    }
	
	@Test
	public void calcularIMCTestPesoIdeal() {
		persona.setPeso(73);
		persona.setAltura(1.73);
		assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
	}
	
	@Test
	public void calcularIMCTestInfraPeso() {
		persona.setPeso(58);
		persona.setAltura(1.73);
		assertEquals(Persona.INFRAPESO, persona.calcularIMC());
	}
	
	@Test
	public void calcularIMCTestSobrePeso() {
		assertEquals(Persona.SOBREPESO, persona.calcularIMC());
	}
	
	@Test
	public void esMayorEdad() {
		assertTrue(persona.esMayorDeEdad());
	}
	
	@Test
	public void noEsMayorEdad() {
		persona.setEdad(17);
		assertFalse(persona.esMayorDeEdad());
	}
}