package io.spring.baeldung.springcloudclientpoc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient {

    @Value("${user.role}")
    String userRole;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @RequestMapping(value = "/whoami/{username}",
    method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username ){
        return String.format("You are %s and project name %s", username, userRole);
    }


}
