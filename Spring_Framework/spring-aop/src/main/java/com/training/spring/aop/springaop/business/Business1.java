package com.training.spring.aop.springaop.business;

import com.training.spring.aop.springaop.aspect.TrackTime;
import com.training.spring.aop.springaop.data.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String caclulateSomething() {
        //business logic
        String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;
    }
}
