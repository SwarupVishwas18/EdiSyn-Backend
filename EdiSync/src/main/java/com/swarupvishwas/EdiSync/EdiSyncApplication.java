package com.swarupvishwas.EdiSync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.swarupvishwas.EdiSync.service", "com.swarupvishwas.EdiSync.controller", "com.swarupvishwas.EdiSync.repository"})
@SpringBootApplication
public class EdiSyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdiSyncApplication.class, args);
	}

}
