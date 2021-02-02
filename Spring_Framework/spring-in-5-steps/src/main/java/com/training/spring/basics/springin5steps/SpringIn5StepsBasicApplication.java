package com.training.spring.basics.springin5steps;

import com.training.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

    //Need to answer for Spring
    //What are the beans? --> @Component
    //What are the dependencies of a bean? --> @Autowired
    //Where to search for beans? --> No need to do this, Spring does for us

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

            BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

            System.out.println(binarySearch1);
            System.out.println(binarySearch);

            int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
            System.out.println(result);
        }
    }

}
