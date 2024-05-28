package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Calculadora {

	@Test
	public void test() {
		float soma;
		Calculadora1 calc = new Calculadora1();
		soma = calc.soma(2.0f, 2.0f);
		assertEquals(4.0,soma,0);
	}

}
