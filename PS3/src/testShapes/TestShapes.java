package testShapes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import baseShapes.Triangle;

public class TestShapes {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Triangle t = new Triangle(3,4,5);
		assertEquals(t.getPerimeter(t), 12);
		assertEquals(t.getArea(t), 6);
		assertEquals(t.toString(t), "The triangle has 3 sides of 1 2 3 and has a perimeter of 12 and an Area of 6");
		
	}

}
