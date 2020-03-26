package cz.nevesnican.nkm.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NKMEurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(NKMEurekaServer.class, args);
	}
}
