package Com.springs.Assignment.withoutXml.Assignment.Config;

import org.springframework.context.annotation.Bean;

import Com.springs.Assignment.withoutXml.Assignment.Animal.Animal;
import Com.springs.Assignment.withoutXml.Assignment.Animal.Cat;
import Com.springs.Assignment.withoutXml.Assignment.Animal.Dog;
import lombok.Data;

@Data
public class AnimalConfigure {

	@Bean
	public Animal getAnimalDog() {
		return new Dog();
	}

	@Bean
	public Animal getAnimalCat() {
		return new Cat();
	}
}
