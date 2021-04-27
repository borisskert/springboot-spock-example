package de.borisskert.spring.spockexample;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String get() {
        return "Hello World!";
    }
}
