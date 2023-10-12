package com.example.kafka.springbootkafka.controller;

import com.example.kafka.springbootkafka.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/kafka")
public class MessageController
{

    public KafkaProducer kafkaProducer;
    public MessageController (KafkaProducer  kafkaProducer){
        this.kafkaProducer=kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("message sent to topic successfully");

    }



}
