package com.training.database.databasedemo;

import com.training.database.databasedemo.entity.Person;
import com.training.database.databasedemo.jdbc.PersonJdbcDAO;
import com.training.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.Date;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", repository.findById(10001));

		logger.info("Inserting -> {}",
				repository.insert(new Person( 10004,"Tara", "Berlin", new Date())));

		logger.info("Updating 10003 -> {}",
				repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));

		repository.deleteById(10002);

		logger.info("All users -> {}", repository.findAll());
/*
		logger.info("Deleting 10002 -> No. of Rows Deleted - {}", dao.deleteById(10002));
		*/

	}
}
