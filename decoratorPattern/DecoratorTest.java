package decoratorPattern;
import java.awt.PageAttributes;

import org.junit.*;
import static org.junit.Assert.*;

public class DecoratorTest {
	
	private Person p1;
	
	@Before
	public void init(){
		this.p1 = new Julie();
		this.p1 = new Trousers(this.p1);
		this.p1 = new Shoes(this.p1);
		this.p1 = new Pullover(this.p1);
	}
	
	@After
	public void clear(){
		this.p1 = null;
	}
	
	@Test
	public void correctAmount(){
		assertEquals(260.0, p1.clothingCost(), 0.0);
	
	}
	
	@Test
	public void correctDescription(){
		assertEquals("Julie, Trousers, Shoes, Pullover", p1.getDescription());
	}
}
