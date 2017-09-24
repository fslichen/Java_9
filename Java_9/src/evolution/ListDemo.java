package evolution;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListDemo {
	@Test
	public void anyMethod() {
		List.of("Hello", "World").forEach(System.out::println);
	}
}
