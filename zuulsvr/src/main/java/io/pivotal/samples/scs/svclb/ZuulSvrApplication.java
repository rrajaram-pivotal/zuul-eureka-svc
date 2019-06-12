package io.pivotal.samples.scs.svclb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //Indicates this is a zuul server
@EnableDiscoveryClient //Indicates that the zuul server is a eureka client
public class ZuulSvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulSvrApplication.class, args);
	}

}
