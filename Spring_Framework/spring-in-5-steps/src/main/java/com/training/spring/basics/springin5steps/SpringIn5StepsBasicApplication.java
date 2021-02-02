package com.training.spring.basics.springin5steps;

import com.training.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

    //Need to answer for Spring
    //What are the beans? --> @Component
    //What are the dependencies of a bean? --> @Autowired
    //Where to search for beans? --> No need to do this, Spring does for us

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch1);
        System.out.println(binarySearch);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println(result);
    }

}
