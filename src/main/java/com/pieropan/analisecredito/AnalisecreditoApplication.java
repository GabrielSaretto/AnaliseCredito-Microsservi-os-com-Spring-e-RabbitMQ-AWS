package com.pieropan.analisecredito;

import com.pieropan.analisecredito.service.AnaliseCreditoService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class AnalisecreditoApplication {

	private AnaliseCreditoService analiseCreditoService;

	public static void main(String[] args) {
		SpringApplication.run(AnalisecreditoApplication.class, args);
	}


}
