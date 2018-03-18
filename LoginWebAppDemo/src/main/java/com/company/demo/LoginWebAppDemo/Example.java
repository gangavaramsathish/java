package com.company.demo.LoginWebAppDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.model.User;
import com.companyname.repository.UserRepository;

@EntityScan(basePackages = { "com.companyname.model" })
@EnableJpaRepositories(basePackages = { "com.companyname.repository" })
@ComponentScan(basePackages={"com.companyname.repository","com.companyname.model"})
@RestController
@SpringBootApplication
public class Example {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	String saveUser(@RequestParam String userid, @RequestParam String username) {
		User user = new User();
		user.setUsername(username);
		
		 System.out.println(userid); System.out.println(username);
		 
		//userRepository.save(user);
		return "Hello World!";
	}
	@RequestMapping(value = "/saveUser/{userid}/{username}", method = RequestMethod.GET)
	String saveUserPath(@PathVariable String userid, @PathVariable String username) {
		User user = new User();
		user.setUsername(username);
		
		 System.out.println(userid); System.out.println(username);
		 
		//userRepository.save(user);
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

}