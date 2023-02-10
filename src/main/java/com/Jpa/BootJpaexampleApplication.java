package com.Jpa;

import com.Jpa.dao.UserRespository;
import com.Jpa.entitities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootJpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJpaexampleApplication.class, args);
		UserRespository userRespository = context.getBean(UserRespository.class);
		List<User> users = userRespository.findUserByName("Sandeep");
		for(User user: users){
			System.out.println(user);
		}


	}

}
