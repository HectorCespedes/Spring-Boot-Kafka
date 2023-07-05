package com.kafka.SpringBootKafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListeners {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaListeners.class);


    @KafkaListener(topics = "hector", groupId = "foo")
    private void listener(String message){
        LOGGER.info("+++++++++Listener received: "+ message);
    }
}
