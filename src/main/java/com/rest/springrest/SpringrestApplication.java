package com.rest.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.rest.springrest.entities.NGO;
import com.rest.springrest.entities.NGOdetails;
import com.rest.springrest.repository.NGOrepo;


@SpringBootApplication
@EntityScan
@EnableJpaRepositories
@EnableAutoConfiguration
public class SpringrestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
	@Autowired
	private NGOrepo repo;

	@Override
	public void run(String... args) throws Exception {
		NGO ngo = new NGO("ankitbora31@gmail.com", 901283, "password","code",false);
		NGOdetails details = new NGOdetails("Save Lives", "Ankit", "detp23", 324232, 8923423,
			"www.google.com", "colony", "pithor", 23432, "uttarakhand");
		
		ngo.setDetails(details);
		repo.save(ngo);
	}


}
