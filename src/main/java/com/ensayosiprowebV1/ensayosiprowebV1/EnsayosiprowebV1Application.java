package com.ensayosiprowebV1.ensayosiprowebV1;

import com.ensayosiprowebV1.ensayosiprowebV1.bean.BeanMiAsignatura;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnsayosiprowebV1Application implements CommandLineRunner {

	private BeanMiAsignatura beanMiAsignatura;

	public EnsayosiprowebV1Application(BeanMiAsignatura beanMiAsignatura) {
		this.beanMiAsignatura = beanMiAsignatura;
	}

	public static void main(String[] args) {
		SpringApplication.run(EnsayosiprowebV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
