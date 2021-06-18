package com.gopalsoft.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.gopalsoft.entity.Employee;
import com.gopalsoft.repository.EmployeeRepository;



@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
@Configuration
public class MongoConfig {


	/*
	 * @Bean public MongoDbFactory mongoDbFactory() {
	 * 
	 * MongoClient mongoClient = new MongoClient("127.0.0.1:27017");
	 * 
	 * return new SimpleMongoDbFactory(mongoClient, "test" ); }
	 * 
	 * @Bean public MongoTemplate mongoTemplate() { return new
	 * MongoTemplate(mongoDbFactory()); }
	 */
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return strings->{
			employeeRepository.save(new Employee("gopal","gb@gmail.com"));
		};
		
	}
	
	
	
}
