package ro.mycode.managegymsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.managegymsystem.service.GymService;

@SpringBootApplication
public class ManageGymSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageGymSystemApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(GymService gymService){
		return  args->{

			gymService.getAllGyms().forEach(System.out::println);

		};

	}
}
