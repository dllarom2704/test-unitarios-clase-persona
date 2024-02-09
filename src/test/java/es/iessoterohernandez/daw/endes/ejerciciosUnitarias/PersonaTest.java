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
        persona = new Persona();
    }
	
	@Test
	public void calcularIMCTestPesoIdeal() {
		persona.setNombre("Jose Luis");
		persona.setEdad(50);
		persona.setSexo('H');
		persona.setPeso(73);
		persona.setAltura(1.73);
		assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
	}
	
	@Test
	public void calcularIMCTestInfraPeso() {
		persona.setNombre("Jesus");
		persona.setEdad(18);
		persona.setSexo('H');
		persona.setPeso(58);
		persona.setAltura(1.73);
		assertEquals(Persona.INFRAPESO, persona.calcularIMC());
	}
	
	@Test
	public void calcularIMCTestSobrePeso() {
		persona.setNombre("David");
		persona.setEdad(18);
		persona.setSexo('H');
		persona.setPeso(92);
		persona.setAltura(1.78);
		assertEquals(Persona.SOBREPESO, persona.calcularIMC());
	}
	
	@Test
	public void esMayorEdad() {
		persona.setNombre("David");
		persona.setEdad(18);
		persona.setSexo('H');
		persona.setPeso(92);
		persona.setAltura(1.78);
		assertTrue(persona.esMayorDeEdad());
	}
	
	@Test
	public void noEsMayorEdad() {
		persona.setNombre("David");
		persona.setEdad(17);
		persona.setSexo('H');
		persona.setPeso(92);
		persona.setAltura(1.78);
		assertFalse(persona.esMayorDeEdad());
	}
}