package com.example.carsale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.carsale.domain.Car;
import com.example.carsale.domain.CarRepository;

@SpringBootApplication
public class CarSaleApplication implements CommandLineRunner {
	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
