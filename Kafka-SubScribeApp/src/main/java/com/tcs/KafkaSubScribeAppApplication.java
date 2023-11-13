package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.tcs.constants.AppConstants;

@SpringBootApplication
public class KafkaSubScribeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubScribeAppApplication.class, args);
	}
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId="group_ashokit_order")
	public void subscribeMsg(String order) {
			System.out.print("*** Msg Recieved From Kafka *** :: ");
			System.out.println(order);
		
	}

}
