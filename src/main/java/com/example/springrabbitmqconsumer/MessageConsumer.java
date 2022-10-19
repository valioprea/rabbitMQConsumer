package com.example.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void consume(CustomMessage message) {
        System.out.println(message);
    }
}
