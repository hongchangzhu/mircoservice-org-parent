package org.mircoservice.org.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrgApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrgApplication.class, args);
	}
}