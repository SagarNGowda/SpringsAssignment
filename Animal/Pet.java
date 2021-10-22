package Com.springs.Assignment.withoutXml.Assignment.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import lombok.Data;

@Data
public class Pet {

	@Autowired
	@Qualifier("getAnimalDog")
	Animal animal;
	
	private String name;
}
