package ude.empresariales.test;

import static org.junit.Assert.*;
import org.junit.Test;
import ude.empresariales.codebreaker.CodeBreaker;

public class CodeBreakerTest {
		
	@Test
	public void numberAreEqual() {
		String numberToCompare = "1234";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("XXXX",result);
	}
	
	@Test
	public void compareOneNumberInPosition() {
		String numberToCompare = "1289";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("XX",result);
	}
	
	@Test
	public void comparetwoNumberInPosition() {
		String numberToCompare = "1275";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("XX",result);
	}
	
	@Test
	public void comparetreeNumberInPosition() {
		String numberToCompare = "1235";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("XXX",result);
	}
	
	@Test
	public void compareOneNumberInPositionAndOtherInWrongPosition() {
		String numberToCompare = "1389";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("X_",result);
	}
	
	@Test
	public void compareTwoNumbersInPositionAndOtherInWrongPosition() {
		String numberToCompare = "1283";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("XX_",result);
	}
	
	@Test
	public void compareOneNumbersInPositionAndOtherthreeInWrongPosition() {
		String numberToCompare = "1423";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("X___",result);
	}
	
	@Test
	public void compareTwoNumbersInPositionAndOtherTwoInWrongPosition() {
		String numberToCompare = "1243";
		CodeBreaker codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(numberToCompare);
		assertEquals("XX__",result);
	}
}
