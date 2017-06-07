package core;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalcTest {
	
	@Test(enabled = true, groups = {"add","all"}, priority=0)
	public void test_add() {
		assertEquals(Calc.add(2, 2), 4);
	}
	@Test(enabled = true, groups = {"sub","all"}, priority=1)
	public void test_subtract() {
		assertEquals(Calc.subtract(4, 2), 2);
	}
	@Test(enabled = true, groups = {"multiply","all"}, priority=2)
	public void test_multiply() {
		assertEquals(Calc.multiply(3, 3), 9);
	}
	@Test(enabled = true, groups = {"divide","all"}, priority=3)
	public void test_divide() {
		assertEquals(Calc.divide(6, 3), 2);
	}
     
	
	@Test(enabled = true, expectedExceptions = ArithmeticException.class, groups = {"division","all"}, priority=4) 
	public void test_divide_by_0() {
		assertEquals(Calc.divide(2, 0), 0);
	}
	
	
	
	@Test(enabled = true, groups = {"all"}, priority=4)
	public void test_object() {
		Calc o = new Calc();
	}
  

}
