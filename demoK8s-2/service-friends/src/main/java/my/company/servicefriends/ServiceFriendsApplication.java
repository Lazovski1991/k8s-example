package my.company.servicefriends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceFriendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFriendsApplication.class, args);
    }

}
