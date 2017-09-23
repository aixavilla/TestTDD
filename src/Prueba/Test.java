package Prueba;

import static org.junit.Assert.*;

public class Test {
	
	public void check (int expected, String input) {
		testP prueba = new testP();
		assertEquals(expected, prueba.add(input));
	}
	
	@org.junit.Test
	public void devuelveNull () {
		check(0, null);
	}
	
	@org.junit.Test
	public void cadenaVacio () {
		check(0,"");
	}
	
	@org.junit.Test
	public void cadenaNoVacia() {
		check(1,"1");
	}
	
	@org.junit.Test
	public void sumaCadena () {
		check(3,"1,2");
	}
	
	@org.junit.Test
	public void cadenaLarga() {
		check(111,"111");
	}

	@org.junit.Test
	public void cadenaLargaDos() {
		check(222,"111,111");
	}
	
	@org.junit.Test
	public void cadena() {
		check(4,"1,1,1,1");
	}
}
