package com.training.spring.basics.springin5steps;

import com.training.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.training.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIn5StepsXMLContextApplication {

    //Need to answer for Spring
    //What are the beans? --> @Component
    //What are the dependencies of a bean? --> @Autowired
    //Where to search for beans? --> No need to do this, Spring does for us

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());
        }
    }

}
