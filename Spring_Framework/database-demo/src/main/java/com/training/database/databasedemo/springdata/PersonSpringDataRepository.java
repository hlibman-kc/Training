package com.training.database.databasedemo.springdata;

import com.training.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
