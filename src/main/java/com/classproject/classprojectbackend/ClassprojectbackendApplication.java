package com.classproject.classprojectbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.classproject")
public class ClassprojectbackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(ClassprojectbackendApplication.class, args);
    }

}
