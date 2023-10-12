package com.example.kafka.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer {

    public static final Logger logger= LoggerFactory.getLogger(
            KafkaProducer.class);

    public KafkaTemplate <String,String> kafkaTemplate;

    public  KafkaProducer(KafkaTemplate <String,String> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;

    }
    public void sendMessage (String message){
        logger.info(String.format("message sent %s",message));
        kafkaTemplate.send("javaguides",message);
    }

}
