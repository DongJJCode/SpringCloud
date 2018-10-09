package dongjjcode.springcloudeurekaha2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class SpringcloudEurekaHa2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaHa2Application.class, args);
	}
}
