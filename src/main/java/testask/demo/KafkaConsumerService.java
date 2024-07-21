package testask.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}
