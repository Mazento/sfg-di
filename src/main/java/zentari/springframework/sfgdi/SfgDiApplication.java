package zentari.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zentari.springframework.sfgdi.controllers.ConstructorInjectedController;
import zentari.springframework.sfgdi.controllers.MyController;
import zentari.springframework.sfgdi.controllers.PetController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
	}

}
