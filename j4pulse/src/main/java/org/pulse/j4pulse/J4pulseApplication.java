package org.pulse.j4pulse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class J4pulseApplication {

	public static void main(String[] args) {
		SpringApplication.run(J4pulseApplication.class, args);
	}

}
