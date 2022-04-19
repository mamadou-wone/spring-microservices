package amir.boss.sn.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "amir-boss-topic", groupId = "wone-group")
    void listener(String data){
        System.out.println("Listener Received: " + data + " :)");
    }

}
