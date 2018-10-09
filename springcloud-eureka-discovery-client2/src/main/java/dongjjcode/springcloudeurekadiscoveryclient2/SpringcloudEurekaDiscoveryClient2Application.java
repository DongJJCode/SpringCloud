package dongjjcode.springcloudeurekadiscoveryclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaDiscoveryClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaDiscoveryClient2Application.class, args);
	}
}
