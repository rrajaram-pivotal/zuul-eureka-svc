package io.pivotal.samples.scs.svcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(ColorProperties.class)
public class BlueGreenSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueGreenSvcApplication.class, args);
	}

}
