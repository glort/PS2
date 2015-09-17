package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {
	
MyInteger MyInt = new MyInteger(3);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	@Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void testMyInteger(){
	
	assert MyInt.getMyInteger() == 3;
	}

	@Test
	public void testIsEven(){
	assert MyInt.isEven() == false;
	}

	@Test
	public void testIsOdd(){
	assert MyInt.isOdd() == true;	}

	@Test
	public void testIsPrime(){
	assert MyInt.isPrime() == true;
	}

	@Test
	public void testIsEvenInt(){
	assert MyInteger.isEven(3) == false;
	}

	@Test
	public void testIsOddInt(){
	assert MyInteger.isOdd(3) == true;
	}

	@Test
	public void testIsPrimeInt(){
	assert MyInteger.isPrime(1) == true;
	assert MyInteger.isPrime(2) == true;
	assert MyInteger.isPrime(3) == true;
	assert MyInteger.isPrime(4) == false;
	assert MyInteger.isPrime(5) == true;
	assert MyInteger.isPrime(9) == false;
	}

	@Test
	public void testEqualsInt(){
	assert MyInt.equals(3)==true;
	}

	@Test
	public void testParseInt(){
	char x[] = {'3','f','5'};
	assert MyInteger.parseInt(x) == 8;
	}

	@Test
	public void testParseString(){
	assert(MyInteger.parseString("23222")==23222);
	}

}
