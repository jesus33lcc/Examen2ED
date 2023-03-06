import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadTest {

	Utilidad uti;
	@Before
	public void before() {
		uti=new Utilidad();
	}
	
	@Test
	public void cP1() {
		int a=0;
		int resultadoEsperado=0;
		int resultadoObtenido=uti.ejercicioD(a);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void cP2() {
		int a=2;
		int resultadoEsperado=4;
		int resultadoObtenido=uti.ejercicioD(a);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void cP3() {
		int a=3;
		int resultadoEsperado=9;
		int resultadoObtenido=uti.ejercicioD(a);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void cP4() {
		int a=4;
		int resultadoEsperado=28;
		int resultadoObtenido=uti.ejercicioD(a);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void cP5() {
		int a=5;
		int resultadoEsperado=125;
		int resultadoObtenido=uti.ejercicioD(a);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	

}
