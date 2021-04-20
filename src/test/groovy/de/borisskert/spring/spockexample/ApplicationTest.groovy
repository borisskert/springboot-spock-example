package de.borisskert.spring.spockexample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class ApplicationTest extends Specification {

    @Autowired
    private ApplicationContext applicationContext;

    def "should initialize application context"() {
        expect: "the application context is initialized"
        applicationContext
    }
}
