package io.pluralsight.ribbontimeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonTimeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonTimeServiceApplication.class, args);
    }

    @Value("${server.port}")
    private int port;

    @GetMapping
    public String getTime() {
        return "Current time is " + new Date().toString() + "answered by service on port " + port;

    }
}
