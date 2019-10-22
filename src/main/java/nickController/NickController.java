package nickController;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NickController {
	@GetMapping("/nick")
	public String saludo(){
		return "esto es mio";
	}
}
