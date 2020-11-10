package com.itheima.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Date:20202020/6/1415:32
 * Author: huangls
 * Desc:
 */

@Component
@RabbitListener(queues = "itcast")
public class TopicConsumer1 {

    @RabbitHandler
    public void getMessage(String msg){
        System.out.println("itcast接收到消息: " + msg);
    }

}
