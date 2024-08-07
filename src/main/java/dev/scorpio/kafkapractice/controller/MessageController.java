package dev.scorpio.kafkapractice.controller;

import dev.scorpio.kafkapractice.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    KafkaProducer producer;

    @PostMapping("/send/{message}")
    public String send(@PathVariable String message){
        producer.sendMessage("vstopic01",message);
        return "echo: "+message;
    }

}
