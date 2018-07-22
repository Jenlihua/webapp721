package com.gumei.spingbootmvc;

import ch.qos.logback.core.spi.PropertyDefiner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.swing.*;

@SpringBootApplication
@Slf4j
public class MockServerApplication {

    public static void main(String[] args){
         SpringApplication.run(MockServerApplication.class, args);
//        CanonicalHostNamePropertyDefiner
//        PropertyDefiner
//        SpringApplication app = new SpringApplication(Demo1Application.class);
//        DefaultProfileUtil.addDefaultProfile(app);
//        Environment env = app.run(args).getEnvironment();
//        log.info("\n----------------------------------------------------------\n\t" +
//                        "Application '{}' is running! Access URLs:\n\t" +
//                        "Local: \t\thttp://localhost:{}\n\t" +
//                        "----------------------------------------------------------",
//                env.getProperty("spring.application.name"),
//                env.getProperty("server.port"));

    }

}
