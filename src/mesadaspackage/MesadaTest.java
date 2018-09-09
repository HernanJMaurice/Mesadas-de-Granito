package mesadaspackage;

import org.junit.Assert;
import org.junit.Test;

public class MesadaTest {
	
	@Test
	public void pruebaConstructor() {
		Mesada mesa = new Mesada (5,2);
		Mesada mesa2 = new Mesada (6, 10);
		Assert.assertNotNull(mesa2);
		Assert.assertNotNull(mesa);
	}
	
	@Test
	public void pruebaApilable() {
		Mesada mesa = new Mesada (5,2);
		Mesada mesa1 = new Mesada (6, 10);
		Assert.assertTrue(mesa.apilableEn(mesa1));
		Mesada mesa2 = new Mesada (5,6);
		Mesada mesa3 = new Mesada (7, 5);
		Assert.assertTrue(mesa2.apilableEn(mesa3));
		Mesada mesa4 = new Mesada (7,11);
		Mesada mesa5 = new Mesada (10, 6);
		Assert.assertFalse(mesa4.apilableEn(mesa5));
	}
	

}
