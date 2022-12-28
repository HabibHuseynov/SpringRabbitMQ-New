package com.example.demo.publisher;

import com.example.demo.dto.Order;
import com.example.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    private final RabbitTemplate rabbitTemplate;

    public OrderPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    @PostMapping("/{name}")
    public String bookOrder(@RequestBody Order order, @PathVariable String name){
        for( int i=0;i<10;i++) {
            order.setOrderId(UUID.randomUUID().toString());
            OrderStatus orderStatus = new OrderStatus(order, "PROCCESS", "ORDER PLACED CORRECTLY " + name);
            rabbitTemplate.convertAndSend("myExchange", "my*", orderStatus);
        }
        return "SUCCESS";

    }
}
