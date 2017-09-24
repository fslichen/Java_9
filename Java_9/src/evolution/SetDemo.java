package evolution;

import java.util.Set;

import org.junit.Test;

public class SetDemo {
	@Test
	public void anyMethod() {
		Set.of("Hello", "World").forEach(System.out::println);
	}
}
