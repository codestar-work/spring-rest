import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController @EnableAutoConfiguration
class Example {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}
	
	@RequestMapping("/student")
	Student student() {
		Student s = new Student();
		s.name = "Harry";
		s.height = 175;
		return s;
	}
}

class Student {
	String name;
	int height;
	public String getName() {
		return name;
	}
}
