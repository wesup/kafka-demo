package testask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/api/messages")
    public void sendMessageToKafka(@RequestBody MessageRequest request) {
        kafkaProducerService.sendMessage(request.getMessage());
    }
}
