package dev.scorpio.kafkapractice.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private KafkaTemplate<String, String> kafkaTemplate = null;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message){
        kafkaTemplate.send(topic, message);
    }
}
