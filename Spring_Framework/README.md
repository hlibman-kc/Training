# Spring_Framework Training
Link to Spring Training repo: https://github.com/in28minutes/spring-master-class

 # Section 1
 Code example: tight coupling to loose coupling
    //Tight Coupling
    public class ComplexBusinessService {SortAlgo sortAlgo = new BubbleSortAlgo();}
    
    //Loose Coupling
    public class ComplexBusinessService {
      SortAlgo sortAlgo; 
      public ComplexBusinessService(SortAlgo sortAlgo) {
        this.sortAlgo = sortAlgo
      }
    }
  
  - Use "@" annotations to identify objects Spring needs to manage and what are the dependencies
    - @Component for the components to manage
      - Spring manages instances of the class
    - @Autowired for the dependency
      - Spring starts looking among the components for a match to this dependency
  - Spring Framework's core logic is Dependency Injection
    - Makes sure the instances of all the objects it manages are created with dependencies properly populated
  - Common Terminology
    - Beans
      - Different objects that are managed by Spring
    - Autowiring
      - Process of identifying dependencies and matches for them and populates them 
    - Depency Injection
      - Injecting dependencies into the component bean
    - Inverson of Control (IOC)
      - Spring creates the instance of the dependency and takes that control away from the class
    - IOC Container
      - Represents anything that is implementing IOC (ex. application context, beanfactory)
    - Application Context
      - Where all the beans are created and managed
      - MOST IMPORTANT PART OF SPRING
        - where all the logic happens
