package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.tcs.constants.AppConstants;
import com.tcs.model.Order;

@Service
public class OrderService {
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public String addMsg(Order order) {
		kafkaTemplate.send(AppConstants.TOPIC_NAME, order);
		return "Kalfa topic Msg is published...";
	}

}