package com.itheima.faout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Date:20202020/6/1415:57
 * Author: huangls
 * Desc:
 */

@Component
@RabbitListener(queues = "itheima")
public class FanoutConsumer1 {

    @RabbitHandler
    public void sendMessage(String msg){
        System.out.println("分裂模式itheima接收到消息：" + msg);
    }
}
