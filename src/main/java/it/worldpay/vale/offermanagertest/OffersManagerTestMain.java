package it.worldpay.vale.offermanagertest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = { "it.worldpay.vale" })
public class OffersManagerTestMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OffersManagerTestMain.class, args);
	}
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
