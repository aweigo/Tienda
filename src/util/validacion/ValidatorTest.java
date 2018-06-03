package util.validacion;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ValidatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsNumber() {
		assertFalse(Validator.isNumber("cosa"));
		assertTrue(Validator.isNumber("2323232"));
		assertTrue(Validator.isNumber("2.323232"));
		assertTrue(Validator.isNumber(".2323232"));
		assertFalse(Validator.isNumber("j2323232"));
		assertTrue(Validator.isNumber("2323232."));
		assertFalse(Validator.isNumber("23d23232"));
		assertFalse(Validator.isNumber("2323232f"));
		assertFalse(Validator.isNumber("2323232d"));
	}

	@Test
	public void testIsPhone(){
		assertTrue(Validator.isPhone("912123987"));
		assertTrue(Validator.isPhone("612123987"));
		assertTrue(Validator.isPhone("712123987"));
		assertFalse(Validator.isPhone("56"));
		assertFalse(Validator.isPhone("56ddd"));
		assertFalse(Validator.isPhone("569876654"));
	}
	@Test
	public void testIsInteger(){
		assertTrue(Validator.isInteger("912123987"));
		assertTrue(Validator.isInteger("2323232"));
		assertTrue(Validator.isInteger("45"));
		assertFalse(Validator.isInteger(".612123987"));
		assertFalse(Validator.isInteger("2.323232"));
		assertFalse(Validator.isInteger("2323232d"));
		assertFalse(Validator.isInteger("2323232f"));
		assertFalse(Validator.isInteger("23d23232"));
	}
	@Test
	public void testIsNombre() {
		assertTrue(Validator.isNombre("Sergio"));
		assertTrue(Validator.isNombre("Sergio Galan    "));
		assertFalse(Validator.isNombre("Sergio5845"));
	}
	
	@Test
	public void testIsID() {
		assertTrue(Validator.isID("5555"));
		assertFalse(Validator.isID("  67545"));
		assertFalse(Validator.isID("5edfs555"));
		
	}
	
	@Test
	public void testComprobarEspacios() {
		assertTrue(Validator.comprobarEspacios("Sergio"));
		assertFalse(Validator.comprobarEspacios(" Sergio"));
		assertFalse(Validator.comprobarEspacios("Sergio "));
		assertFalse(Validator.comprobarEspacios(" "));
		assertFalse(Validator.comprobarEspacios("Sergio Galan"));
	}
	
	@Test
	public void testisWord() {
		assertTrue(Validator.isWord("abc"));
		assertFalse(Validator.isWord("14"));
		assertFalse(Validator.isWord("nsjs78"));
	}
	
	
	@Test
	public void testisCIF() {
		assertFalse(Validator.isCIF("09212358F"));
		assertFalse(Validator.isCIF(" 09212358F"));
		assertTrue(Validator.isCIF("A09212358"));
		assertFalse(Validator.isCIF("A92358"));
	}
	
	@Test
	public void testisNIF() {
		assertFalse(Validator.isNIF("F09212358"));
		assertFalse(Validator.isNIF(" 09212358F"));
		assertTrue(Validator.isNIF("09212358F"));
		assertFalse(Validator.isNIF("A92358"));
		assertFalse(Validator.isNIF("A92 358"));
	}
	
	@Test
	public void testIsPrecio() {
		assertTrue(Validator.isPrecio("46"));
		assertFalse(Validator.isPrecio(" 46"));
		assertTrue(Validator.isPrecio("46.56"));
		assertFalse(Validator.isPrecio("406..56"));
		assertFalse(Validator.isPrecio("406aa.56"));
		assertTrue(Validator.isPrecio("0"));
		
	
	}
	
}
