package com.erm.middleware;

import com.erm.middleware.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class RestServerMain {
    public static void main(String[] args) {
        SpringApplication.run(RestServerMain.class, args);
    }
}
