package basics;

import org.junit.Test;

public class Quiz1Demo {

	private final int i = 99;

	@Test
	public void canIterate() {
		for (int i = 0; i < 5; i++)
		{
			System.out.println(i);
		}
		System.out.println(i);
	}

	@Test
	public void canIterate2() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			for (int j = 0; j < 5; j++) {
				System.out.println(j);
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void canDemoOperatorPrecedence() {
		int i = 0;
		int j = 0;
		System.out.println(++i);
		System.out.println(j++);
	}
}
