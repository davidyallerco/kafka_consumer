package net.yallerco.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.yallerco.kafka.components.Consumidor;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
		

		Consumidor consumidor = new Consumidor();
		consumidor.suscribir("topicoPrueba");
		
	}

}
