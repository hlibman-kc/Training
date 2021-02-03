package com.training.spring.basics.springin5steps;

import com.training.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.training.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    //Need to answer for Spring
    //What are the beans? --> @Component
    //What are the dependencies of a bean? --> @Autowired
    //Where to search for beans? --> No need to do this, Spring does for us

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {

            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            System.out.println(service.returnServiceURL());
        }
    }

}
