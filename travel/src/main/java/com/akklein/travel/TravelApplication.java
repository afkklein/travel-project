package com.akklein.travel;

import com.akklein.travel.entity.Person;
import com.akklein.travel.entity.Travel;
import com.akklein.travel.repository.PersonRepository;
import com.akklein.travel.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelApplication {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private TravelRepository travelRepository;

	public static void main(String[] args) {
		SpringApplication.run(TravelApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Person person1 = new Person();
			person1.setName("Astolfo");
			person1.setBirthDate("1980-09-22");
			person1.setCpf("111.111.111-11");

			Person person2 = new Person();
			person2.setName("Robson");
			person2.setBirthDate("1960-03-15");
			person2.setCpf("222.222.222-22");

			Travel travel1 = new Travel();
			travel1.setCompany("Gol");
			travel1.setDepartureAirport("Cuiaba");
			travel1.setDestinationAirport("Congonhas");
			travel1.setFlight("XPTO2020");
			travel1.setPassenger(person1);

			Travel travel2 = new Travel();
			travel2.setCompany("Azul");
			travel2.setDepartureAirport("Brasilia");
			travel2.setDestinationAirport("Congonhas");
			travel2.setFlight("XYZZ1988");
			travel2.setPassenger(person2);

			this.personRepository.save(person1);
			this.personRepository.save(person2);

			this.travelRepository.save(travel1);
			this.travelRepository.save(travel2);
		};
	}

}
