package com.example.kafka.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaConsumer {
    public static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics="javaguides",groupId = "myGroup")
    public void consumeMessage(String message){

        logger.info(String.format("message received %s",message));


    }
}
