package mesadaspackage;

import org.junit.Assert;
import org.junit.Test;


public class ConstructorTest {

	@Test
	public void pruebaResolver() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[6];
		mesadas[0] =new Mesada(4,6);
		mesadas[1] =new Mesada(9,3);
		mesadas[2] =new Mesada(2,2);
		mesadas[3] =new Mesada(1,2);
		mesadas[4] =new Mesada(1,12);
		mesadas[5] =new Mesada(2,7);
		Assert.assertEquals(3, cons.resolver(mesadas));
	}
	
	@Test
	public void pruebaResolver1() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[2];
		mesadas[0] =new Mesada(2,3);
		mesadas[1] =new Mesada(3,2);
		Assert.assertEquals(1, cons.resolver(mesadas));
	}
	
	@Test
	public void pruebaResolver2() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[6];
		mesadas[0] =new Mesada(3,4);
		mesadas[1] =new Mesada(2,5);
		mesadas[2] =new Mesada(3,4);
		mesadas[3] =new Mesada(2,5);
		mesadas[4] =new Mesada(3,4);
		mesadas[5] =new Mesada(2,5);
		Assert.assertEquals(2, cons.resolver(mesadas));
	}
	
	@Test
	public void pruebaResolver3() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[7];
		mesadas[0] =new Mesada(4,5);
		mesadas[1] =new Mesada(6,3);
		mesadas[2] =new Mesada(5,4);
		mesadas[3] =new Mesada(6,3);
		mesadas[4] =new Mesada(7,2);
		mesadas[5] =new Mesada(7,2);
		mesadas[6] =new Mesada(8,1);
		Assert.assertEquals(4, cons.resolver(mesadas));
	}
	
	@Test
	public void pruebaResolver4() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[7];
		mesadas[0] =new Mesada(9,5);
		mesadas[1] =new Mesada(10,4);
		mesadas[2] =new Mesada(11,3);
		mesadas[3] =new Mesada(9,5);
		mesadas[4] =new Mesada(9,5);
		mesadas[5] =new Mesada(10,4);
		mesadas[6] =new Mesada(1,2);
		Assert.assertEquals(3, cons.resolver(mesadas));
	}
	@Test
	public void pruebaResolver5() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[7];
		mesadas[0] =new Mesada(9,5);
		mesadas[1] =new Mesada(9,5);
		mesadas[2] =new Mesada(4,10);
		mesadas[3] =new Mesada(5,9);
		mesadas[4] =new Mesada(9,5);
		mesadas[5] =new Mesada(10,4);
		mesadas[6] =new Mesada(5,9);
		Assert.assertEquals(2, cons.resolver(mesadas));
	}
	
	@Test
	public void pruebaResolver6() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[5];
		mesadas[0] =new Mesada(10,6);
		mesadas[1] =new Mesada(10,8);
		mesadas[2] =new Mesada(11,9);
		mesadas[3] =new Mesada(12,8);
		mesadas[4] =new Mesada(14,9);
		Assert.assertEquals(2, cons.resolver(mesadas));
	}
	
	@Test
	public void pruebaResolver7() {
		Constructora cons = new Constructora();
		Mesada [] mesadas = new Mesada[7];
		mesadas[0] =new Mesada(2,1);
		mesadas[1] =new Mesada(3,1);
		mesadas[2] =new Mesada(2,2);
		mesadas[3] =new Mesada(12,1);
		mesadas[4] =new Mesada(7,2);
		mesadas[5] =new Mesada(5,4);
		mesadas[6] =new Mesada(9,3);
		Assert.assertEquals(3, cons.resolver(mesadas));
	}
	
}
