package com.itheima.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Date:20202020/6/1415:52
 * Author: huangls
 * Desc:
 */

@Component
@RabbitListener(queues = "itcast")
public class DirectConsumer {

    @RabbitHandler
    public void getMessage(String msg){
        System.out.println("直接模式接收到消息: " + msg);
    }
}
