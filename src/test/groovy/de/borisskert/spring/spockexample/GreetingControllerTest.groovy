package de.borisskert.spring.spockexample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@AutoConfigureMockMvc
@WebMvcTest
class GreetingControllerTest extends Specification {

    @Autowired
    private MockMvc mvc;

    def "should respond with 200 'Hello World!'"() {
        expect: "Status is 200 and body is 'Hello World!'"
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andReturn()
                .response.contentAsString == "Hello World!"
    }
}
