import static org.junit.Assert.*;


import org.junit.Test;

import Model.Person;

/**
 * 
 */

/**
 * @author moises.correa
 *
 */
public class PersonTest {
	Person person = new Person();

	/**
	 * Test method for {@link Model.Person#isAdult(int)}.
	 */
	@Test
	public void testIsAdult1() {		
		boolean resultReal = person.isAdult(18);
		boolean resultWait = true;
		assertEquals(resultWait,resultReal);
	}

	/**
	 * Test method for {@link Model.Person#isAdult(int)}.
	 */
	@Test
	public void testIsAdult2() {		
		boolean resultReal = person.isAdult(15);
		boolean resultWait = false;
		assertEquals(resultWait,resultReal);
	}


	/**
	 * Test method for {@link Model.Person#isAdult(int)}.
	 */
	@Test
	public void testIsAdult3() {
		try {
			person.isAdult(-5);
			fail("Número negativo");
		}catch(Exception e) {}
	}

}
