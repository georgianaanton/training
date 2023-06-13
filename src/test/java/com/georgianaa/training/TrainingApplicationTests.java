package com.georgianaa.training;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class })
class TrainingApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("running tests");
    }

}
