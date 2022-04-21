package Package;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

		StudentRepository repo = context.getBean(StudentRepository.class);

		Student student1 = new Student(null, "Juan", "juan@calderon.com", "312309", 19);
		Student student2 = new Student(null, "Gabriel", "gabo@calderon.com", "350890", 13);
		Student student3 = new Student(null, "Mry", "mry@ortiz.com", "310808", 37);
		Student student4 = new Student(null, "Mao", "mao@calderon.com", "310569", 42);

		repo.save(student1);
		repo.save(student2);
		repo.save(student3);
		repo.save(student4);

		System.out.println("La cantidad de estudiantes es: "+repo.count());

		System.out.println("Los datos de los estudiantes son: " + repo.findAll());

	}

}
