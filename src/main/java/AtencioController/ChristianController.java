package AtencioController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/christian")
public class ChristianController {
	@GetMapping("/")
	public String p1() {
		return "hola profe";
	}
}
