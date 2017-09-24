package evolution;

import java.util.Map;

import org.junit.Test;

public class MapDemo {
	@Test
	public void anyMethod() {
		Map.of("age", 27, "score", 10).forEach((x, y) -> System.out.println(x + " : " + y));
	}
}
