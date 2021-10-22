package Com.springs.Assignment.withoutXml.Assignment.Config;

import org.springframework.context.annotation.Bean;

import Com.springs.Assignment.withoutXml.Assignment.Animal.Pet;
import lombok.Data;

@Data
public class PetConfig {

	@Bean
	public Pet getPet()
	{
		Pet pet = new Pet();
		pet.setName("Dog");
		return pet;
	}
}
