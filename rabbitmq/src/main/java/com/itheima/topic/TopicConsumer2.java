package com.itheima.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Date:20202020/6/1415:36
 * Author: huangls
 * Desc:
 */

@Component
@RabbitListener(queues = "itheima")
public class TopicConsumer2 {

    @RabbitHandler
    public void getMessage(String msg){
        System.out.println("itheima接收到消息: " + msg);
    }
}
