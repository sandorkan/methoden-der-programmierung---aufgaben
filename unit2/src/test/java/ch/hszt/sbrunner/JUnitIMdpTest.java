package ch.hszt.sbrunner;

import org.junit.*;

//NEW static import for assert methods
import static org.junit.Assert.*;

public class JUnitIMdpTest {
	
	private JUnitIMdp testInstance;
	private String emptyString;
	private String nullString;
	private String testString;
	
	@Before
    public void init() {
        this.testInstance = new JUnitIMdp();
        emptyString = "";
    	nullString = null;
    	testString = "abCdE";
    }
	
	@After
	public void clear(){
		this.testInstance = null;
	}
	
	@Test
	public void isEmptyTest(){
		assertTrue(testInstance.isEmpty(emptyString));
		assertTrue(testInstance.isEmpty(nullString));
		assertFalse(testInstance.isEmpty(testString));	
	}
	
	@Test
	public void capitalizeTest(){
		assertEquals("Abcde", testInstance.capitalize(testString));
	}
	
	@Test(expected=NullPointerException.class) 
      public void reverseTestException() {
        testInstance.reverse(nullString);
    }
	
	@Test
	public void reverseTest(){
		assertEquals("EdCba", testInstance.reverse(testString));
	}
	
	@Test
	public void joinTest(){
		assertEquals("Ein guter Test", testInstance.join("Ein","guter","Test"));
	}
	
	
	
	
	
	
}
