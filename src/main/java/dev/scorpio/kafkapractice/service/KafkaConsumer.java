package dev.scorpio.kafkapractice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics="vstopic01"/*, groupId = "my-group"*/)
    public void listen(String message){
        System.out.println("Received Message from vaibhav: "+message);
    }
}
