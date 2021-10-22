package Com.springs.Assignment.withoutXml.Assignment.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.springs.Assignment.withoutXml.Assignment.Animal.Pet;
import Com.springs.Assignment.withoutXml.Assignment.Config.PAConfig;

public class AnimalMain {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
						PAConfig.class)) {
			Pet pet = (Pet) annotationConfigApplicationContext.getBean("getPet");
			System.out.println(pet);
			pet.getAnimal().sound();
			pet.getAnimal().colour();
		}
	}

}
