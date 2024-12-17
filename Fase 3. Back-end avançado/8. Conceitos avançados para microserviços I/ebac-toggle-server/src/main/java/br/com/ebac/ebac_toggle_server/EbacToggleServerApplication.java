package br.com.ebac.ebac_toggle_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EbacToggleServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EbacToggleServerApplication.class, args);
	}
}
